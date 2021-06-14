package com.example.SpringAOP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringAopApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringAopApplication.class, args);
        Mensaje mensaje = context.getBean(Mensaje.class);
        // Los aspectos solo se aplican si desde otra clase se llama a los
        // métodos a los que se quiere hacer referencia
        // Estos métodos pueden ser public o protected
        // Pero si nosotros llamamos a un método dentro de la misma clase, me da
        // igual si es public, protected o private, que el aspecto no se va a
        // aplicar a ese método
        mensaje.metodo();
        mensaje.escribirMensajeHola();
        mensaje.escribirMensajeMundo();
    }

}
