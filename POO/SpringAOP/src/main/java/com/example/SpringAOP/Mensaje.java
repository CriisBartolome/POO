package com.example.SpringAOP;

import org.springframework.stereotype.Component;

@Component
public class Mensaje {

    private int numEjecuciones;
    private int numEjecucionesMetodo;

    public void escribirMensajeHola() {
        numEjecuciones++;
        System.out.println("Hola");
        metodo();
    }

    public void escribirMensajeMundo() {
        numEjecuciones++;
        System.out.println("Mundo");
    }

    protected void metodo() {
        numEjecuciones++;
        numEjecucionesMetodo++;
        System.out.println("Metodo protected");
    }

    public Integer getNumEjecuciones() {
        numEjecuciones++;
        return numEjecuciones;
    }
    
    @MiAnotacionAspectos(mensaje = "Contando")
    public Integer getNumEjecucionesMetodo() {
        numEjecuciones++;
        return numEjecucionesMetodo;
    }

}
