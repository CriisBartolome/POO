package com.example.ServicioRESTClaveCompuestaEmbeddedId;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class ProductoKey implements Serializable {

    @Pattern(regexp = "^C.*", message = "El nombre tiene que empezar por C mayúscula")
    private String nombre;
    private Integer id;
}
