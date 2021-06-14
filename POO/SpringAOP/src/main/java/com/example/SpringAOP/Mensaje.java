package com.example.SpringAOP;

import org.springframework.stereotype.Component;

@Component
public class Mensaje {
    
    public void escribirMensajeHola() {
        System.out.println("Hola");
        metodo();
    }
    public void escribirMensajeMundo() {
        System.out.println("Mundo");
    }
    protected void metodo() {
        System.out.println("Metodo protected");
    }

}
