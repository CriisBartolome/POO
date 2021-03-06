package com.example.ServicioRESTTestMockMVC;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
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
    @ResponseStatus(HttpStatus.CREATED)
    public @ResponseBody Producto postProductos(@RequestBody @Valid Producto producto) {
        return productosRepository.save(producto);
    }

}
