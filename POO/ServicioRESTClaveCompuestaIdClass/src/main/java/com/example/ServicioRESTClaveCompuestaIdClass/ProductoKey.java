package com.example.ServicioRESTClaveCompuestaIdClass;

import java.io.Serializable;

import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductoKey implements Serializable {

    @Pattern(regexp = "^C.*", message = "El nombre tiene que empezar por C mayúscula")
    private String nombre;
    private Integer id;
}
