package com.example.ServicioRESTOpenAPI;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ServicioRESTOpenAPI.api.DefaultApi;
import com.example.ServicioRESTOpenAPI.model.Producto;

@RestController
public class ProductosController implements DefaultApi {
    
    @Autowired
    ProductosRepository productosRepository;
    
    @GetMapping(value = "/", produces = { "application/json" })
    public ResponseEntity<List<Producto>> getProductos() {
        ProductoMapper mapper = Mappers.getMapper(ProductoMapper.class);
        List<ProductoEntity> listaEntity = productosRepository.findAll();
        List<Producto> lista = new ArrayList<>();
        listaEntity.forEach(producto -> {
            Producto productoFind = mapper.productoEntityAProducto(producto);
            lista.add(productoFind);
        });
        /*for (ProductoEntity producto : listaEntity) {
            Producto productoFind = mapper.productoEntityAProducto(producto);
            lista.add(productoFind);
        }*/
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }

    @PostMapping(value = "/", produces = { "application/json" })
    public ResponseEntity<Producto> postProductos(@Valid @RequestBody Producto producto) {
        /*ProductoEntity productoEntity = new ProductoEntity();
        productoEntity.setId(producto.getId());
        productoEntity.setNombre(producto.getNombre());
        productoEntity.setPrecio(producto.getPrecio());
        productoEntity.setCategoria(producto.getCategoria());
        productosRepository.save(productoEntity);
        return new ResponseEntity<>(producto, HttpStatus.CREATED);*/
        ProductoMapper mapper = Mappers.getMapper(ProductoMapper.class);
        ProductoEntity productoEntity = mapper.productoAProductoEntity(producto);
        productosRepository.save(productoEntity);
        return new ResponseEntity<>(producto, HttpStatus.CREATED);
        
    }
    
}
