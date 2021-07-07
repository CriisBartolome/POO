package com.example.Spring5WebFluxProgramacionReactiva;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class ProductosController {

    @Autowired
    ProductosRepository productosRepository;

    @GetMapping
    public Flux<Producto> getProductos() {
        return Flux.fromIterable(productosRepository.findAll());
    }

    @PostMapping
    public Mono<Producto> postProductos(@RequestBody @Valid Producto producto) {
        return Mono.just(productosRepository.save(producto));
    }

}
