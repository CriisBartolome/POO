
public class VolatileContador {
    
    private volatile int contador;

    public int getContador() {
        return contador;
    }
    
    public void incrementar() {
        contador++;
    }
    
}
