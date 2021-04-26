//ConcreteFactory
public class CrearArchivo implements Factory {

    //factoryMethod(): Product
    @Override
    public Archivo crear(int tipo) {
        Archivo objeto;
        switch (tipo) {
            case AUDIO:
                objeto = new ArchivoAudio();
                break;
            case VIDEO:
                objeto = new ArchivoVideo();
                break;
            default:
                objeto = null;
        }
        return objeto;
    }

}
