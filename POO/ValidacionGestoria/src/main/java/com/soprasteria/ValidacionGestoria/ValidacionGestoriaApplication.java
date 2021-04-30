package com.soprasteria.ValidacionGestoria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ValidacionGestoriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ValidacionGestoriaApplication.class, args);
		
		Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();
        
        Thread gestor1 = new Gestor("Gestor1", cliente1);
        Thread gestor2 = new Gestor("Gestor2", cliente2);
        
        System.out.println("Inicio de las gestiones");
        System.out.println("----------------------------------------------------------------");
        
        gestor1.start();
        gestor2.start();
        
        while(gestor1.isAlive() || gestor2.isAlive()) {
            
        }
        
        System.out.println("Gestiones terminadas");

	}

}
