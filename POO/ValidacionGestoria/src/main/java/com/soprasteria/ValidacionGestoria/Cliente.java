package com.soprasteria.ValidacionGestoria;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Cliente {
    
    @Size(max = 10, message = "El nombre excede la longitud máxima de 10 caracteres")
    private String nombreCliente;
    
    @Pattern(regexp = "[X][0-9]{3}[A-E]")
    private String DNI;
    
    @Min(value = 18, message = "La edad no puede ser menos de 18")
    @Max(value = 50, message = "La edad no puede ser más de 50")
    private int edad;
    
    public String getNombreCliente() {
        return nombreCliente;
    }
    
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    
    public String getDNI() {
        return DNI;
    }
    
    public void setDNI(String dNI) {
        DNI = dNI;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
        
}
