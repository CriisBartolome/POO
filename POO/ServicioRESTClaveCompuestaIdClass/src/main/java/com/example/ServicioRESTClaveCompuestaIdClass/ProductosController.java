package com.example.ServicioRESTClaveCompuestaIdClass;

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

    // Si quiero que me devuelva un tipo concreto, tengo que añadir en el pom la
    // dependecia de ese tipo y además indicarlo en el GetMapping
    // En este caso, quiero que me lo devuelva en formato XML
    // Por defecto, recibe y devuelve JSON
    @GetMapping
    public @ResponseBody List<Producto> getProductos() {
        return productosRepository.findAll();
    }

    // Primero indico el tipo del objeto que recibe, que en este caso es JSON
    // Si quiero que me devuelva un tipo concreto, tengo que añadir en el pom la
    // dependecia de ese tipo y además indicarlo en el GetMapping
    // En este caso, quiero que me lo devuelva en formato XML
    @PostMapping
    public @ResponseBody Producto postProductos(@RequestBody @Valid Producto producto) {
        return productosRepository.save(producto);
    }

}
