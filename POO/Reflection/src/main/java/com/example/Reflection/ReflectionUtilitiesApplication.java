package com.example.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionUtilitiesApplication {

    public static void main(String[] args) {

        try {
            // Obtengo la clase
            Class<?> clase = ReflectionUtilities.obtenerClase("com.example.Reflection.Suma");

            // Obtengo el constructor vacío de la clase
            Constructor<?> constructor1 = ReflectionUtilities.obtenerConstructor(clase);

            // Muestro el nombre y los parámetros que requiere
            ReflectionUtilities.mostrarInfoConstructor(constructor1);

            // Creo una instancia de la clase a traves del constructor
            Object suma1 = ReflectionUtilities.crearInstancia(constructor1);

            // Obtengo el método que me interesa de la clase (el que no tiene
            // parámetros)
            Method metodo1 = ReflectionUtilities.obtenerMetodo(constructor1, "sumar");

            // Escribo su nombre y lo invoco
            ReflectionUtilities.mostrarInfoMetodo(metodo1, suma1);

            // Obtengo el método que me interesa de la clase (el que tiene que
            // recibir parámetros)
            Method metodo2 = ReflectionUtilities.obtenerMetodo(constructor1, "sumar", int.class, int.class);

            // Escribo su nombre y lo invoco
            ReflectionUtilities.mostrarInfoMetodo(metodo2, suma1, 4, 6);

            System.out.println("--------------------------------");

            // Obtengo el constructor de la clase que recibe parámeteros
            Constructor<?> constructor2 = ReflectionUtilities.obtenerConstructor(clase, int.class, int.class);

            // Muestro el nombre y los parámetros que requiere
            ReflectionUtilities.mostrarInfoConstructor(constructor2);

            // Creo una instancia de la clase a traves del constructor
            Object suma2 = ReflectionUtilities.crearInstancia(constructor2, 2, 4);

            // Obtengo el método que me interesa de la clase (el que no tiene
            // parámetros)
            Method metodo3 = ReflectionUtilities.obtenerMetodo(constructor2, "sumar");

            // Escribo su nombre y lo invoco
            ReflectionUtilities.mostrarInfoMetodo(metodo3, suma2);

            // Obtengo el método que me interesa de la clase (el que tiene que
            // recibir parámetros)
            Method metodo4 = ReflectionUtilities.obtenerMetodo(constructor2, "sumar", int.class, int.class);

            // Escribo su nombre y lo invoco
            ReflectionUtilities.mostrarInfoMetodo(metodo4, suma2, 4, 6);

        } catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException
                | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

}
