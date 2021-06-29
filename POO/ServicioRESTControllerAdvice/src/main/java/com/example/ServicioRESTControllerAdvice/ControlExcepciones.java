package com.example.ServicioRESTControllerAdvice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControlExcepciones{
    
    @ExceptionHandler(value = ProductsNotFoundException.class)

    public ResponseEntity<Object> exception(ProductsNotFoundException exception) {
        return new ResponseEntity<>("La base de datos está vacía", HttpStatus.NOT_FOUND);
    }

}
