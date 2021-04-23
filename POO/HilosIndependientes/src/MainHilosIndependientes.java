
public class MainHilosIndependientes {

    public static void main(String[] args) {
        
        System.out.println("Iniciando el main");
        System.out.println("------------------------");
        
        //Hilos usando la clase que hereda de Thread
        Thread hilo1 = new HilosIndependientesUsandoThread("Hilo1");
        Thread hilo2 = new HilosIndependientesUsandoThread("Hilo2");
        
        //Hilos usando la clase que implementa Runnable
        Thread hilo3 = new Thread(new HilosIndependientesUsandoRunnable(), "Hilo3");
        Thread hilo4 = new Thread(new HilosIndependientesUsandoRunnable(), "Hilo4");
        
        hilo1.start();
        hilo2.start();       
        
        hilo3.start();
        hilo4.start();        
        
        while(hilo1.isAlive() || hilo2.isAlive() || hilo3.isAlive() || hilo4.isAlive()) {
            
        }
        System.out.println("Finalizando el main");
    }

}
