package com.example.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.function.Consumer;

public class ReflectionReutilizacionCodigoApplication {

    public static Consumer<String> escribir = info -> System.out.println(info);

    public static void main(String[] args) {
        try {
            // Obtengo la clase
            Class<?> clase = obtenerClase("com.example.Reflection.Suma");

            // Obtengo el constructor vacío de la clase
            Constructor<?> constructor1 = obtenerConstructor(clase, null);

            // Muestro el nombre y los parámetros que requiere
            mostrarInfoConstructor(constructor1);

            // Creo una instancia de la clase a traves del constructor
            Object suma1 = crearInstancia(constructor1, null);

            // Obtengo el método que me interesa de la clase (el que no tiene
            // parámetros)
            Method metodo1 = obtenerMetodo(constructor1, "sumar", null);

            // Escribo su nombre y lo invoco
            mostrarInfoMetodo(metodo1, suma1, null);

            // Obtengo el método que me interesa de la clase (el que tiene que
            // recibir parámetros)
            Class<?>[] clasesParametros = { int.class, int.class };
            Method metodo2 = obtenerMetodo(constructor1, "sumar", clasesParametros);

            // Escribo su nombre y lo invoco
            int[] valores = { 4, 6 };
            mostrarInfoMetodo(metodo2, suma1, valores);

            escribir.accept("--------------------------------");

            // Obtengo el constructor de la clase que recibe parámeteros
            Constructor<?> constructor2 = obtenerConstructor(clase, clasesParametros);

            // Muestro el nombre y los parámetros que requiere
            mostrarInfoConstructor(constructor2);

            // Creo una instancia de la clase a traves del constructor
            int[] datos = { 2, 4 };
            Object suma2 = crearInstancia(constructor2, datos);

            // Obtengo el método que me interesa de la clase (el que no tiene
            // parámetros)
            Method metodo3 = obtenerMetodo(constructor2, "sumar", null);

            // Escribo su nombre y lo invoco
            mostrarInfoMetodo(metodo3, suma2, null);

            // Obtengo el método que me interesa de la clase (el que tiene que
            // recibir parámetros)
            Method metodo4 = obtenerMetodo(constructor2, "sumar", clasesParametros);

            // Escribo su nombre y lo invoco
            mostrarInfoMetodo(metodo4, suma2, valores);

        } catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException
                | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            e.printStackTrace();
        }

    }

    private static Class<?> obtenerClase(String string) throws ClassNotFoundException {
        return Class.forName(string);
    }

    private static Constructor<?> obtenerConstructor(Class<?> clase, Class<?>[] clasesParametros)
            throws NoSuchMethodException, SecurityException {
        if (clasesParametros == null) {
            return clase.getConstructor();
        }
        return clase.getConstructor(clasesParametros[0], clasesParametros[1]);
    }

    private static void mostrarInfoConstructor(Constructor<?> constructor1) {
        escribir.accept("Constructor: " + constructor1.getName());
        escribir.accept("Parametros necesarios para el constructor: " + constructor1.getParameterCount());
    }

    private static Object crearInstancia(Constructor<?> constructor1, int[] parametros)
            throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (parametros == null) {
            return constructor1.newInstance();
        }
        return constructor1.newInstance(parametros[0], parametros[1]);
    }

    private static Method obtenerMetodo(Constructor<?> constructor1, String string, Class<?>[] clasesParametros)
            throws NoSuchMethodException, SecurityException {
        if (clasesParametros == null) {
            return constructor1.getDeclaringClass().getMethod(string);
        }
        return constructor1.getDeclaringClass().getMethod(string, clasesParametros[0], clasesParametros[1]);
    }

    private static void mostrarInfoMetodo(Method metodo1, Object suma1, int[] parametros)
            throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        escribir.accept("Metodo: " + metodo1.toString());
        if (parametros == null) {
            escribir.accept(" = " + metodo1.invoke(suma1));
        } else if (parametros.length == 2) {
            escribir.accept(" = " + metodo1.invoke(suma1, parametros[0], parametros[1]));
        }
    }

}
