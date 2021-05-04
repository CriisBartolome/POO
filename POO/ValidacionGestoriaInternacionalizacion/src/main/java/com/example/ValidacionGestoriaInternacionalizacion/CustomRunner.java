package com.example.ValidacionGestoriaInternacionalizacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CustomRunner implements CommandLineRunner{

    @Autowired
    private Validate validate;

    @Override
    public void run(String... args) throws Exception {
        //Aquí iría el código que normalmente escribo dentro del main
        Cliente cliente = new Cliente();
        cliente.setNombreCliente("sajmkwajdkwnqkwjskl");
        cliente.setDNI("X123CC");
        cliente.setEdad(56);
        validate.valid(cliente);
        System.out.println("Fin del programa");
        
    }
}
