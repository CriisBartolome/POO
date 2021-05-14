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
public class ClaseArray implements Serializable{

    private String atributo1;
    private int atributo2;
    private String atributo3;
    private int atributo4;
    private Alumno [] atributo5;

    // Crear clase alumnos
    // Aquí tendré un array de alumnos
    // Convertir a JSON el array y leerlo
}
