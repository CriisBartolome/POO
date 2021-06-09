package com.example.conexionConH2Productos;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Productos")
public class Producto {

    private String nombre;
    @Id
    private Integer id;
    private Double precio;
    private String categoria;
}
