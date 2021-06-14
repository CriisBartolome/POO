package com.example.SpringAOP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class SpringAopApplication {

	public static void main(String[] args) {
	    ApplicationContext context = SpringApplication.run(SpringAopApplication.class, args);
        Mensaje empleado = context.getBean(Mensaje.class); 
		empleado.escribirMensajeHola();
		empleado.escribirMensajeMundo();
	}

}
