import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Marcos", "García");
        try {
            ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream("Personas"));
            stream.writeObject(persona1);
            stream.close();
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("Personas"));
            Persona persona2 = (Persona) input.readObject();
            System.out.println(persona2);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
