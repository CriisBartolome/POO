package com.example.ConexionConH2JDBCConfiguracionManual;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConexionConH2JDBCConfiguracionManualApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConexionConH2JDBCConfiguracionManualApplication.class, args);
        
        /*DataSource dataSource = new DataSource();
        dataSource.setDriverClassName("org.h2.Driver");
        dataSource.setUrl("jdbc:h2:mem:testdb");
        dataSource.setUsername("sa");
        dataSource.setPassword("");*/
    }
}
