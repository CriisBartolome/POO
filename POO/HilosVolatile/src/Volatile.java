
public class Volatile extends Thread{
    
    private volatile boolean cambio;
    private int valor;

    public void run() {
        while(!cambio) {
            System.out.println(Thread.currentThread().getName() + " -> Valor no disponible");
        }
        System.out.println(Thread.currentThread().getName() + " -> Leyendo valor -> " + valor);
    }    

    public void setValor(int valor) {
        this.valor = valor;
        cambio = true;
    }
    
}
