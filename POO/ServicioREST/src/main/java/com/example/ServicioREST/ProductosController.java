package com.example.ServicioREST;

import java.util.List;

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
        return productosRepository.findAll();
    }

    @PostMapping
    public @ResponseBody Producto postProductos(@RequestBody Producto producto) {
        return productosRepository.save(producto);
    }

}
