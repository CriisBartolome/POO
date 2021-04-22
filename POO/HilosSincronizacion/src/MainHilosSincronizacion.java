
public class MainHilosSincronizacion {

    public static void main(String[] args){
        /*Thread hilo1 = new HilosNoSincronizados("Hilo1");
        Thread hilo2 = new HilosNoSincronizados("Hilo2");
        
        hilo1.start();
        hilo2.start();*/

        Thread hilo3 = new HilosSincronizados("Hilo3");
        Thread hilo4 = new HilosSincronizados("Hilo4");
               
        hilo3.start();
        hilo4.start();
    }

}
