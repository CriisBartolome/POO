package com.example.ServicioRESTClaveCompuestaEmbeddedId;

import javax.persistence.EmbeddedId;
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

    @EmbeddedId
    private ProductoKey clave;
    private Double precio;
    private String categoria;
}
