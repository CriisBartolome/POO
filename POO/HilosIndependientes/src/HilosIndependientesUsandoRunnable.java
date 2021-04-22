
public class HilosIndependientesUsandoRunnable implements Runnable{

    @Override
    public void run() {
        for(int contador = 0 ; contador <= 8; contador++) {
            System.out.println(Thread.currentThread().getName() + " -> Iteración nº " + contador);
        }
        System.out.println("Termina el thread " + Thread.currentThread().getName());        
    }

}
