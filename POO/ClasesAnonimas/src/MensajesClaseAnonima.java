
public class MensajesClaseAnonima {

    public void escribir() {
        // Clase anonima de la interfaz
        new MensajeInterfaz() {
            
            @Override
            public void escribirMensaje() {
                System.out.println("Mensaje de clase an�nima usando interfaz");
            }

        }.escribirMensaje();

        // Clase anonima de la abstract class
        new MensajeAbstract() {
            
            @Override
            public void escribirMensaje() {
                System.out.println("Mensaje de clase an�nima usando abstract class");
            }
            
        }.escribirMensaje();

        // Clase anonima de una clase
        new Mensaje() {
            
            @Override
            public void escribirMensaje() {
                System.out.println("Mensaje de clase an�nima usando una clase");
            }

        }.escribirMensaje();

    }

}
