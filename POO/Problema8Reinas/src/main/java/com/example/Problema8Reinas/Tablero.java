package com.example.Problema8Reinas;

public class Tablero {

    private static final int TAMANO = 8;
    private int[] solucion;
    private int contadorReinas;

    public Tablero() {
        solucion = new int[TAMANO];
        inicializar();
        contadorReinas = 0;
    }

    private void inicializar() {
        for (int posicion = 0; posicion < TAMANO; posicion++) {
            solucion[posicion] = -1;
        }
    }

    public boolean colocar(int fila, int columna) {
        if (contadorReinas == TAMANO) {
            return true;
        } else {
            for (int posicion = columna; posicion < TAMANO; posicion++) {
                if (esValida(fila, posicion)) {
                    solucion[fila] = posicion;
                    contadorReinas++;
                    posicion = 0;
                    if (!colocar(fila + 1, posicion)) {
                        posicion = solucion[fila];
                        solucion[fila] = -1;
                        contadorReinas--;
                    }
                    else {
                        return true;
                    }
                }
            }
        }
        return false;

    }

    // PROBLEMA AQUÍ
    private boolean esValida(int fila, int columna) {
        for (int posicion = 0; posicion < contadorReinas; posicion++) {
            if ((posicion == fila) || (solucion[posicion] == columna)
                    || (posicion - solucion[posicion] == fila - columna)
                    || (posicion + solucion[posicion] == fila + columna)) {
                return false;
            }
        }
        return true;
    }

    public void imprimirSolucion() {
        System.out.println("Solución");
        for (int i = 0; i < TAMANO; i++) {
            System.out.print("(" + i + "," + solucion[i] + ") ");

        }
    }
}
