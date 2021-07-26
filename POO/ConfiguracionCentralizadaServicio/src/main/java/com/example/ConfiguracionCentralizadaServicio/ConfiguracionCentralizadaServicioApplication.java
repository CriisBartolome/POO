package com.example.ConfiguracionCentralizadaServicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

//Para probarlo:
//Lanzar primero el servicio
//Lanzar el cliente
//Comprobar el mensaje que tiene el cliente en http://localhost:8080/message
//Comprobar el mensaje que ve el servicio en http://localhost:8888/config-client/default
//Ir a github y modificar el mensaje del cliente
//Ver que el servicio tiene el cambio en http://localhost:8888/config-client/default
//Abrir postman y hacer una petición POST vacía a la url http://localhost:8080/actuator/refresh
//Ver que el cliente tiene el cambio en http://localhost:8080/message

@EnableConfigServer
@SpringBootApplication
public class ConfiguracionCentralizadaServicioApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfiguracionCentralizadaServicioApplication.class, args);
	}

}
