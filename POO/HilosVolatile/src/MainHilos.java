
public class MainHilos {

    public static void main(String[] args) {
        
        VolatileContador vContador = new VolatileContador();
        Thread hilo1 = new VolatileThread(vContador);
        Thread hilo2 = new VolatileThread(vContador);

        hilo1.start();
        hilo2.start();
        
        while(hilo1.isAlive() && hilo2.isAlive()) {
            
        }
        
    }

}
