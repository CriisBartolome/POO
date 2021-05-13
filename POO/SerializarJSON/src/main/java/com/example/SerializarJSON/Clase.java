package com.example.SerializarJSON;

import java.io.Serializable;

public class Clase implements Serializable {

    private String atributo1;
    private int atributo2;
    private String atributo3;
    private int atributo4;

    public Clase(String atributo1, int atributo2, String atributo3, int atributo4) {
        super();
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
        this.atributo3 = atributo3;
        this.atributo4 = atributo4;
    }

    public Clase() {

    }

    public String getAtributo1() {
        return atributo1;
    }    

    public int getAtributo2() {
        return atributo2;
    }    

    public String getAtributo3() {
        return atributo3;
    }    

    public int getAtributo4() {
        return atributo4;
    }    
    
    public String toString() {
        return "atributo1: " + atributo1 + "\natributo2: " + atributo2 + "\natributo3: " + atributo3 + "\natributo4: " + atributo4;
    }

    // Crear clase alumnos
    // Aquí tendré un array de alumnos
    // Convertir a JSON el array y leerlo

}
