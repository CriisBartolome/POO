
public class ClaseExterna {

    private String mensaje = "Puedo acceder a una variable de la clase externa";
    private static String mensajeStatic = "Puedo acceder a una variable estática de la clase externa";
    
    public void escribir() {
        System.out.println("Soy una clase externa");
    }
    public void escribirInterna() {
        System.out.println("Creo un objeto de la clase interna para poder acceder a él");
        ClaseInterna claseInterna = new ClaseInterna();
        claseInterna.escribir();
    }

    public class ClaseInterna {
        public void escribir() {
            System.out.println("Soy una clase interna");
            System.out.println(mensaje);
            System.out.println(mensajeStatic);
        }
    }
}
