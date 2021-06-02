package com.example.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.function.Consumer;

public class Utilities {

    public Consumer<String> escribir;

    public Utilities() {
        escribir = info -> System.out.println(info);
    }

    public Class<?> obtenerClase(String string) throws ClassNotFoundException {
        return Class.forName(string);
    }

    public Constructor<?> obtenerConstructor(Class<?> clase, Class<?>... clasesParametros)
            throws NoSuchMethodException, SecurityException {
        return clase.getConstructor(clasesParametros);
    }

    public void mostrarInfoConstructor(Constructor<?> constructor1) {
        escribir.accept("Constructor: " + constructor1.getName());
        escribir.accept("Parametros necesarios para el constructor: " + constructor1.getParameterCount());
    }

    public Object crearInstancia(Constructor<?> constructor1, Object... parametros)
            throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        return constructor1.newInstance(parametros);
    }

    public Method obtenerMetodo(Constructor<?> constructor1, String string, Class<?>... clasesParametros)
            throws NoSuchMethodException, SecurityException {
        return constructor1.getDeclaringClass().getMethod(string, clasesParametros);
    }

    public void mostrarInfoMetodo(Method metodo1, Object suma1, Object... parametros)
            throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        escribir.accept("Metodo: " + metodo1.toString());
        escribir.accept(" = " + metodo1.invoke(suma1, parametros));
    }

}
