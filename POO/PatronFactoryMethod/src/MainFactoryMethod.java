
public class MainFactoryMethod {

    public static void main(String[] args) {

        CrearArchivoFactory creadorArchivo = new CrearArchivoFactory();
        
        Archivo audio = creadorArchivo.crear(CrearArchivoFactory.AUDIO);
        audio.reproducir();
        Archivo video = creadorArchivo.crear(CrearArchivoFactory.VIDEO);
        video.reproducir();
        
        Archivo audio1 = creadorArchivo.crear(TipoArchivos.AUDIO);
        audio1.reproducir();
        Archivo video1 = creadorArchivo.crear(TipoArchivos.VIDEO);
        video1.reproducir();
        
        Archivo audio2 = creadorArchivo.crear("AUDIO");
        audio2.reproducir();
        Archivo video2 = creadorArchivo.crear("VIDEO");
        video2.reproducir();

    }

}
