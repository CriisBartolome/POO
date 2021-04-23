
public class HilosIndependientesUsandoThread extends Thread{

    public HilosIndependientesUsandoThread(String nombreHilo){
        super(nombreHilo);
    }
    
    public void run() {
        for(int contador = 0 ; contador <= 8; contador++) {
            System.out.println(getName() + " -> Iteración nº " + contador);
        }
        System.out.println("Termina el thread " + getName());
        System.out.println("------------------------");
    }
    
}
