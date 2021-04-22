
public class HilosSincronizados extends Thread{

    private static volatile int suma;

    public HilosSincronizados(String nombreHilo) {
        super(nombreHilo);
        suma = 0;
    }

    public void run() {
        
        sumar1();
        //sumar2();
        
    }

    private static synchronized void sumar1(){
        for (int sumador = 1; sumador <= 10; sumador++) {
            suma++;
            System.out.println(Thread.currentThread().getName() + " suma: " + suma);           
        }
        
    }
    
    private void sumar2() {
        synchronized (getClass()) {
            for (int sumador = 1; sumador <= 10; sumador++) {
                suma++;
                System.out.println(getName() + " suma: " + suma);
                getClass().notifyAll();
                try {
                    getClass().wait();
                }
                catch (java.lang.InterruptedException e) {
                
                }
                getClass().notifyAll();
            }            
        }
    }
    
}
