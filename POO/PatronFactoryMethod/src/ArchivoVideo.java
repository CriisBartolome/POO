//ConcreteProduct
public class ArchivoVideo implements Archivo{

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo archivo de vídeo...");        
    }

}
