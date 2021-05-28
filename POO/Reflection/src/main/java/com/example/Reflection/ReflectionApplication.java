package com.example.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.function.Consumer;

public class ReflectionApplication {

    public static void main(String[] args) {

        Consumer<String> escribir = info -> System.out.println(info);

        try {
            // Obtengo el constructor vacío de la clase
            Constructor<?> constructor1 = Suma.class.getConstructor();

            // Muestro el nombre y los parámetros que requiere
            escribir.accept("Constructor: " + constructor1.getName());
            escribir.accept("Parametros necesarios para el constructor: " + constructor1.getParameterCount());

            // Creo una instancia de la clase a traves del constructor
            Suma suma1 = (Suma) constructor1.newInstance();

            // Muestro los sumandos y llamo a los métodos de la clase
            escribir.accept("Sumando 1: " + suma1.getSumando1());
            escribir.accept("Sumando 2: " + suma1.getSumando2());
            escribir.accept(" = " + suma1.sumar());
            escribir.accept(" = " + suma1.sumar(3, 5));

            // Obtengo el método que me interesa de la clase (el que no tiene
            // parámetros)
            Method metodo1 = constructor1.getDeclaringClass().getMethod("sumar");

            // Escribo su nombre y lo invoco
            escribir.accept("Metodo: " + metodo1.toString());
            escribir.accept(" = " + metodo1.invoke(suma1));

            // Obtengo el método que me interesa de la clase (el que tiene que
            // recibir parámetros)
            Method metodo2 = constructor1.getDeclaringClass().getMethod("sumar", int.class, int.class);

            // Escribo su nombre y lo invoco
            escribir.accept("Metodo: " + metodo2.toString());
            escribir.accept(" = " + metodo2.invoke(suma1, 4, 6));

            escribir.accept("--------------------------------");

            // Obtengo el constructor de la clase que recibe parámetros
            Constructor<?> constructor2 = Suma.class.getConstructor(int.class, int.class);

            // Muestro el nombre y los parámetros que requiere
            escribir.accept("Constructor: " + constructor2.getName());
            escribir.accept("Parametros necesarios para el constructor: " + constructor2.getParameterCount());

            // Creo una instancia de la clase a traves del constructor
            Suma suma2 = (Suma) constructor2.newInstance(2, 4);

            // Muestro los sumandos y llamo a los métodos de la clase
            escribir.accept("Sumando 1: " + suma2.getSumando1());
            escribir.accept("Sumando 2: " + suma2.getSumando2());
            escribir.accept(" = " + suma2.sumar());
            escribir.accept(" = " + suma2.sumar(3, 5));

            // Obtengo el método que me interesa de la clase (el que no tiene
            // parámetros)
            Method metodo3 = constructor1.getDeclaringClass().getMethod("sumar");

            // Escribo su nombre y lo invoco
            escribir.accept("Metodo: " + metodo3.toString());
            escribir.accept(" = " + metodo3.invoke(suma2));

            // Obtengo el método que me interesa de la clase (el que tiene que
            // recibir parámetros)
            Method metodo4 = constructor1.getDeclaringClass().getMethod("sumar", int.class, int.class);

            // Escribo su nombre y lo invoco
            escribir.accept("Metodo: " + metodo4.toString());
            escribir.accept(" = " + metodo4.invoke(suma2, 4, 6));

        } catch (NoSuchMethodException | SecurityException | InstantiationException
                | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            e.printStackTrace();
        }

    }

}
