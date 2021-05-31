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
            /*Constructor<?> constructor1 = Suma.class.getConstructor();

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
            Method metodo3 = constructor2.getDeclaringClass().getMethod("sumar");

            // Escribo su nombre y lo invoco
            escribir.accept("Metodo: " + metodo3.toString());
            escribir.accept(" = " + metodo3.invoke(suma2));

            // Obtengo el método que me interesa de la clase (el que tiene que
            // recibir parámetros)
            Method metodo4 = constructor2.getDeclaringClass().getMethod("sumar", int.class, int.class);

            // Escribo su nombre y lo invoco
            escribir.accept("Metodo: " + metodo4.toString());
            escribir.accept(" = " + metodo4.invoke(suma2, 4, 6));

            escribir.accept("--------------------------------");*/

            // Si quiero hacerlo totalmente de forma anónima
            // Obtengo la clase
            Class clase = Class.forName("com.example.Reflection.Suma");

            // Obtengo el constructor vacío de la clase
            Constructor<?> constructor3 = clase.getConstructor();

            // Muestro el nombre y los parámetros que requiere
            escribir.accept("Constructor: " + constructor3.getName());
            escribir.accept("Parametros necesarios para el constructor: " + constructor3.getParameterCount());

            // Creo una instancia de la clase a traves del constructor
            Object suma3 = constructor3.newInstance();

            // Obtengo el método que me interesa de la clase (el que no tiene
            // parámetros)
            Method metodo5 = constructor3.getDeclaringClass().getMethod("sumar");

            // Escribo su nombre y lo invoco
            escribir.accept("Metodo: " + metodo5.toString());
            escribir.accept(" = " + metodo5.invoke(suma3));

            // Obtengo el método que me interesa de la clase (el que tiene que
            // recibir parámetros)
            Method metodo6 = constructor3.getDeclaringClass().getMethod("sumar", int.class, int.class);

            // Escribo su nombre y lo invoco
            escribir.accept("Metodo: " + metodo6.toString());
            escribir.accept(" = " + metodo6.invoke(suma3, 4, 6));

            escribir.accept("--------------------------------");

            // Obtengo el constructor de la clase que recibe parámetros
            Constructor<?> constructor4 = clase.getConstructor(int.class, int.class);

            // Muestro el nombre y los parámetros que requiere
            escribir.accept("Constructor: " + constructor4.getName());
            escribir.accept("Parametros necesarios para el constructor: " + constructor4.getParameterCount());

            // Creo una instancia de la clase a traves del constructor
            Object suma4 = constructor4.newInstance(2, 4);

            // Obtengo el método que me interesa de la clase (el que no tiene
            // parámetros)
            Method metodo7 = constructor4.getDeclaringClass().getMethod("sumar");

            // Escribo su nombre y lo invoco
            escribir.accept("Metodo: " + metodo7.toString());
            escribir.accept(" = " + metodo7.invoke(suma4));

            // Obtengo el método que me interesa de la clase (el que tiene que
            // recibir parámetros)
            Method metodo8 = constructor4.getDeclaringClass().getMethod("sumar", int.class, int.class);

            // Escribo su nombre y lo invoco
            escribir.accept("Metodo: " + metodo8.toString());
            escribir.accept(" = " + metodo8.invoke(suma4, 4, 6));

        } catch (NoSuchMethodException | SecurityException | InstantiationException
                | IllegalAccessException | IllegalArgumentException
                | InvocationTargetException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
