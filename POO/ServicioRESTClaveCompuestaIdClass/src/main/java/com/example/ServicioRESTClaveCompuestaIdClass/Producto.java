package com.example.ServicioRESTClaveCompuestaIdClass;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
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
@IdClass(ProductoKey.class)
public class Producto {

    @Pattern(regexp = "^C.*", message = "El nombre tiene que empezar por C mayúscula")
    @Id
    private String nombre;
    @Id
    private Integer id;
    private Double precio;
    private String categoria;
}
