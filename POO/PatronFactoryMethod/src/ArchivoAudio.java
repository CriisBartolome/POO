//ConcreteProduct
public class ArchivoAudio implements Archivo{

    @Override
     public void reproducir() {
        System.out.println("Reproduciendo archivo de audio...");
    }
}
