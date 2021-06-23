package com.example.ServicioOpenAPI;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ServicioOpenAPI.api.DefaultApi;
import com.example.ServicioOpenAPI.model.Producto;

@RestController
public class ProductosController implements DefaultApi {
    
    @GetMapping(value = "/", produces = { "application/json" })
    public ResponseEntity<Producto> getProductos() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping(value = "/", produces = { "application/json" })
    public ResponseEntity<Void> postProductos(Object producto) {
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
