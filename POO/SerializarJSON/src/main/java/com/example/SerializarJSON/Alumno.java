package com.example.SerializarJSON;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Alumno implements Serializable {

    private String nombre;
    private String apellido;
    private int edad;
    private int numExpediente;

}
