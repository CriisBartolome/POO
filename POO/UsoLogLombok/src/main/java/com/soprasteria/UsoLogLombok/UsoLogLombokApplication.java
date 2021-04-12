package com.soprasteria.UsoLogLombok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

//@Log
@Slf4j
@SpringBootApplication
public class UsoLogLombokApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsoLogLombokApplication.class, args);
		
		log.debug("Hola");
		log.info("Registro usando @Log de Lombok");
		log.error("Error en el logging");
		log.warn("Cuidado");
		log.trace("Traza");
		//System.out.println(log.getName());
		//System.out.println(log.hashCode());
		//System.out.println(log.toString());
		//System.out.println(log.GLOBAL_LOGGER_NAME);
		//System.out.println(log.getClass());
		//System.out.println(log.getAnonymousLogger());
	}

}
