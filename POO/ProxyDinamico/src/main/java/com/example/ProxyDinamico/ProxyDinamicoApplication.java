package com.example.ProxyDinamico;

import java.lang.reflect.Proxy;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProxyDinamicoApplication {

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static void main(String[] args) {
        SpringApplication.run(ProxyDinamicoApplication.class, args);

        Map proxyInstance = (Map) Proxy.newProxyInstance(
                ControladorProxyDinamico.class.getClassLoader(),
                new Class[] { Map.class },
                new ControladorProxyDinamico());
        System.out.println("return: " + proxyInstance.put("hola", "mundo"));
        System.out.println("return: " + proxyInstance.get("hola"));
        //Necesito devolver un boolean no un integer, por eso me salta un error
        //Solo sirve en este caso para métodos que devuelvan un integer
        //System.out.println("return: " + proxyInstance.containsKey("hola"));
    }

}
