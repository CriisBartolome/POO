package com.example.Colocar8ReinasAleatorias;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main8ReinasAleatorias {

    private static int numReinas = 8;

    public static void main(String[] args) {
        Tablero tablero = new Tablero();
        ExecutorService executor = Executors.newFixedThreadPool(numReinas);
        for (int i = 0; i < 8; i++) {
            Runnable reina = tablero;
            executor.execute(reina);
        }

        executor.shutdown(); // Cierro el Executor

        while (!executor.isTerminated()) {
            // Espero a que terminen de ejecutarse todos los procesos
            // para pasar a las siguientes instrucciones
        }
        
        tablero.imprimirSolucion();
        if (!tablero.colocacionCorrecta()) {
            tablero.recolocar();
        }
        tablero.imprimirSolucion();
    }

}
