package com.example.ServicioRESTControllerAdvice;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductosController {

    @Autowired
    ProductosRepository productosRepository;

    @GetMapping
    public @ResponseBody List<Producto> getProductos() {
        if (productosRepository.count() == 0) {
            throw new ProductsNotFoundException();
        }
        return productosRepository.findAll();
    }

    @PostMapping
    public @ResponseBody Producto postProductos(@RequestBody @Valid Producto producto) {
        return productosRepository.save(producto);
    }

}
