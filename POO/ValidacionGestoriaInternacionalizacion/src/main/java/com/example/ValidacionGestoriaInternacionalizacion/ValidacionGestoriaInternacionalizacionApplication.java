package com.example.ValidacionGestoriaInternacionalizacion;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ValidacionGestoriaInternacionalizacionApplication {

	public static void main(String[] args) {
	    Locale.setDefault(Locale.FRENCH);
		SpringApplication.run(ValidacionGestoriaInternacionalizacionApplication.class, args);
	}

}
