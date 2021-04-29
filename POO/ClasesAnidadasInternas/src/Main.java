
public class Main {

    public static void main(String[] args) {
        ClaseExterna claseExterna = new ClaseExterna();
        claseExterna.escribir();
        System.out.println("---------------------------------------------------------");
        
        //Forma 1 de acceder a la clase interna: usando un método que me crea un objeto de ella
        claseExterna.escribirInterna();
        System.out.println("---------------------------------------------------------");
        
        //Forma 2 de acceder a la clase interna: desde el objeto de la clase externa
        ClaseExterna.ClaseInterna claseInterna = claseExterna.new ClaseInterna();
        claseInterna.escribir();
        
    }

}
