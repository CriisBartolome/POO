package com.example.ServicioRESTOpenAPI;

import java.util.List;

import javax.validation.Valid;

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
        productosRepository.findAll();
        /*Producto p = new Producto();
        p.setId(1L);
        return new ResponseEntity<>(p,HttpStatus.OK);*/
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping(value = "/", produces = { "application/json" })
    public ResponseEntity<Void> postProductos(@Valid @RequestBody Producto producto) {
        com.example.ServicioRESTOpenAPI.Producto productoEntity = new com.example.ServicioRESTOpenAPI.Producto();
        productoEntity.setId(producto.getId());
        productoEntity.setNombre(producto.getNombre());
        productoEntity.setPrecio(producto.getPrecio());
        productoEntity.setCategoria(producto.getCategoria());
        productosRepository.save(productoEntity);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    
}
