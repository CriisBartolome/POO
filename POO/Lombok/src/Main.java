
public class Main {

    public static void main (String args []) {
        Lombok lombok = Lombok.builder().propiedad1("MiPropiedad").propiedad2("MiPropiedad2").build();
        //lombok.setPropiedad1("MiPropiedad");
        System.out.println(lombok);
    }
}
