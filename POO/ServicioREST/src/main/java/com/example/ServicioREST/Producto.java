package com.example.ServicioREST;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Productos")
public class Producto {

    // Los nombres de los productos tienen que comenzar por la letra C mayúscula
    @Pattern(regexp = "C.*", message = "El nombre tiene que empezar por C mayúscula")
    private String nombre;
    @Id
    // Solo puede recibir enteros, tanto positivos como negativos
    //@Pattern(regexp = "-?[0-9]*", message = "El id solo puede ser un número entero")
    private Integer id;
    private Double precio;
    private String categoria;
}
