
public class HilosNoSincronizados extends Thread{

    private static int suma;
    
    public HilosNoSincronizados(String nombreHilo) {
        super(nombreHilo);
        suma = 0;
    }
    
    public void run() {
        sumar();
    }

    private void sumar() {
        for (int sumador = 1; sumador <= 10; sumador++) { 
            suma++;
            System.out.println(getName() + " suma: " + suma);
        }
        
    }
    
}
