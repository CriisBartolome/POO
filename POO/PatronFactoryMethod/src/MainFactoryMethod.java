
public class MainFactoryMethod {

    public static void main(String[] args) {
        
        CrearArchivo creadorArchivo = new CrearArchivo();
        Archivo audio = creadorArchivo.crear( CrearArchivo.AUDIO );
        audio.reproducir();
        Archivo video = creadorArchivo.crear( CrearArchivo.VIDEO );
        video.reproducir();

    }

}
