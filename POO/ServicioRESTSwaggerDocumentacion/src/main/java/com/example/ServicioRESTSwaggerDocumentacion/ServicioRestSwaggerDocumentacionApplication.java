package com.example.ServicioRESTSwaggerDocumentacion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Para acceder a la documentación en formato JSON
//http://localhost:8080/v2/api-docs

//Para hacer a la ui de swagger
//http://localhost:8080/swagger-ui.html

@SpringBootApplication
public class ServicioRestSwaggerDocumentacionApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServicioRestSwaggerDocumentacionApplication.class, args);
    }

}
