package com.example.ValidacionGestoriaInternacionalizacion;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cliente {
    
    @Size(max = 10, message = "{cliente.size}")
    private String nombreCliente;
    
    @Pattern(regexp = "X[0-9]{3}[A-E]")
    private String DNI;
    
    @Min(value = 18, message = "{cliente.min}")
    @Max(value = 50, message = "{cliente.max}")
    private int edad;
    
}