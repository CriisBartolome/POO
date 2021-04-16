package com.soprasteria.UsoLogLombok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainPruebaMDC {
    public static void main(String[] args) {
        SpringApplication.run(MainPruebaMDC.class, args);
        
        UsoMDCLog usoMDC = new UsoMDCLog("Usando", "MDC de log");
        usoMDC.agregarDatosMDC();
    }
}
