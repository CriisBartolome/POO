package com.example.ServicioRESTClaveCompuestaIdClass;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductoKey implements Serializable {

    private String nombre;
    private Integer id;
}
