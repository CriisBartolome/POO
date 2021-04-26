//Factory
public interface Factory {

    public static final int AUDIO = 1;
    public static final int VIDEO = 2;
    
    //factoryMethod(): Product
    public Archivo crear(int tipo);
}
