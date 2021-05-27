package com.example.ProxyDinamico;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ControladorProxyDinamico implements InvocationHandler {

    private static Logger LOGGER = LoggerFactory.getLogger(
            ControladorProxyDinamico.class);

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        LOGGER.info("Método invocado: {}", method.getName());
        return 42;
    }

}
