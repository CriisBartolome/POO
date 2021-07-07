package com.example.Spring5WebFluxProgramacionReactiva;

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

    @Pattern(regexp = "^C.*", message = "El nombre tiene que empezar por C mayúscula")
    private String nombre;
    @Id
    private Integer id;
    private Double precio;
    private String categoria;
}
