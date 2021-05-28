package com.example.ProxyDinamico;

import java.lang.reflect.Proxy;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProxyDinamicoApplication {

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static void main(String[] args) {
        SpringApplication.run(ProxyDinamicoApplication.class, args);

        // Creando una clase que implementa la interfaz funcional
        // InvocationHandler
        Map proxyInstance1 = (Map) Proxy.newProxyInstance(
                ControladorProxyDinamico.class.getClassLoader(),
                new Class[] { Map.class },
                new ControladorProxyDinamico());
        System.out.println("return: " + proxyInstance1.put("hola", "mundo"));
        System.out.println("return: " + proxyInstance1.get("hola"));
        // Necesito devolver un boolean no un integer, por eso me salta un error
        // Solo sirve en este caso para métodos que devuelvan un integer
        // System.out.println("return: " + proxyInstance.containsKey("hola"));

        // Usando expresiones lambda porque InvocationHandler es una interfaz
        // funcional
        Map proxyInstance2 = (Map) Proxy.newProxyInstance(
                ControladorProxyDinamico.class.getClassLoader(),
                new Class[] { Map.class },
                (proxy, method, methodArgs) -> {
                    Logger LOGGER = LoggerFactory.getLogger(ControladorProxyDinamico.class);
                    LOGGER.info("Método invocado: {}", method.getName());
                    return 42;

                });
        System.out.println(proxyInstance2.get("hola")); // 42
        System.out.println(proxyInstance2.put("hola", "mundo"));
    }

}
