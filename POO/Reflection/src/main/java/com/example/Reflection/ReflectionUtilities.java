package com.example.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.function.Consumer;

public class ReflectionUtilities {

    public static Consumer<String> escribir;

    static {
        escribir = info -> System.out.println(info);
    }

    private ReflectionUtilities() {

    }

    public static Class<?> obtenerClase(String string) throws ClassNotFoundException {
        return Class.forName(string);
    }

    public static Constructor<?> obtenerConstructor(Class<?> clase, Class<?>... clasesParametros)
            throws NoSuchMethodException, SecurityException {
        return clase.getConstructor(clasesParametros);
    }

    public static void mostrarInfoConstructor(Constructor<?> constructor1) {
        escribir.accept("Constructor: " + constructor1.getName());
        escribir.accept("Parametros necesarios para el constructor: " + constructor1.getParameterCount());
    }

    public static Object crearInstancia(Constructor<?> constructor1, Object... parametros)
            throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        return constructor1.newInstance(parametros);
    }

    public static Method obtenerMetodo(Constructor<?> constructor1, String string, Class<?>... clasesParametros)
            throws NoSuchMethodException, SecurityException {
        return constructor1.getDeclaringClass().getMethod(string, clasesParametros);
    }

    public static void mostrarInfoMetodo(Method metodo1, Object suma1, Object... parametros)
            throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        escribir.accept("Metodo: " + metodo1.toString());
        escribir.accept(" = " + metodo1.invoke(suma1, parametros));
    }

}
