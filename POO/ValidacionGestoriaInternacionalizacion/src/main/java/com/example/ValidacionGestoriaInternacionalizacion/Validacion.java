package com.example.ValidacionGestoriaInternacionalizacion;

import javax.validation.Valid;

import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component
@Validated
public class Validacion implements Validate{

    @Override
    public void valid(@Valid Cliente cliente) {
        System.out.println("Hola Mundo");        
    }

}
