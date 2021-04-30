package com.soprasteria.ValidacionGestoria;
import java.util.Scanner;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

public class Gestor extends Thread{

    private String nombre;
    private volatile Cliente cliente;
    
    public Gestor(String nombre, Cliente cliente) {
        super(nombre);
        this.nombre = nombre;
        this.cliente = cliente;
    }
    
    @Override
    public void run() {
        System.out.println(this.nombre + " COMIENZA A PROCESAR LOS DOCUMENTOS");
        
        Scanner scanner = new Scanner(System.in);
        //cliente.setNombreCliente(anadirNombre(scanner));
        String nombre = anadirNombre(scanner);
        cliente.setNombreCliente(nombre);
        
        String dni = anadirDNI(scanner);
        cliente.setDNI(dni);
        
        int edad = anadirEdad(scanner);
        cliente.setEdad(edad);
        
        validate(cliente);
        
        System.out.println("------------------------------------------------------------------");
    }
    
    private static synchronized String anadirNombre(Scanner scanner) {
        System.out.println("Introduzca el nombre del cliente del " + currentThread().getName());
        return new String (scanner.nextLine());
    }
    
    private static synchronized String anadirDNI(Scanner scanner) {
        System.out.println("Introduzca el DNI del cliente del " + currentThread().getName());
        return new String(scanner.nextLine());
    }

    private static synchronized int anadirEdad(Scanner scanner) {
        System.out.println("Introduzca la edad del cliente del " + currentThread().getName());
        return scanner.nextInt();
    }
    
    private void validate(Cliente cliente) {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<Cliente>> violations = validator.validate(cliente);
        if (violations.isEmpty()) {
            System.out.println(this.nombre + " ha revisado correctamente la documentación de "
                    + cliente.getNombreCliente() + " con DNI " + cliente.getDNI()
                    + " y edad " + cliente.getEdad() + " años");
        } else {
            System.out.println(this.nombre + " ha intentado revisar los datos del cliente "
                    + "y se han obtenido los siguientes fallos:");
            violations.forEach(violation -> {
                String message = violation.getPropertyPath()
                        + ": " + violation.getMessage();
                System.out.println(message);
            });
        }
    }
    
}
