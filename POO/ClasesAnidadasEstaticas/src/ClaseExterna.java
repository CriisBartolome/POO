
public class ClaseExterna {

    private static String mensaje = "Puedo acceder a una variable estatica de la clase externa";
    
    public void escribir() {
        System.out.println("Soy una clase externa");
    }

    public static class ClaseEstatica {
        public void escribir() {
            System.out.println("Soy una clase estática");
            System.out.println(mensaje);
        }
    }
}
