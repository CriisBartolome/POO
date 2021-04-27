import java.util.Scanner;

public class Gestor extends Thread implements Empleo{

    private String nombre;
    private volatile ClienteGestoria cliente;
    
    public Gestor(String nombre, ClienteGestoria cliente) {
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
        
        System.out.println(this.nombre + " ha revisado correctamente la documentación de " + cliente.getNombreCliente()
                    + " con DNI " + cliente.getDNI() + " y edad " + cliente.getEdad() + " años");
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
    
}
