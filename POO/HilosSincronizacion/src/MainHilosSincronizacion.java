
public class MainHilosSincronizacion {

    public static void main(String[] args){
        
        Thread hilo1 = new HilosNoSincronizados("Hilo1");
        Thread hilo2 = new HilosNoSincronizados("Hilo2");
        
        System.out.println("Hilos no sincronizados");
        System.out.println("--------------------------");
        
        hilo1.start();
        hilo2.start();
        
        while(hilo1.isAlive() || hilo2.isAlive()) {
            
        }
        
        System.out.println("--------------------------");
        System.out.println("Fin hilos no sincronizados");
        System.out.println("--------------------------");

        Thread hilo3 = new HilosSincronizados("Hilo3");
        Thread hilo4 = new HilosSincronizados("Hilo4");
        
        System.out.println("Hilos sincronizados");
        System.out.println("--------------------------");
               
        hilo3.start();
        hilo4.start();
        
        while(hilo3.isAlive() || hilo4.isAlive()) {
            
        }
        
        System.out.println("--------------------------");
        System.out.println("Fin hilos sincronizados");
        
    }

}
