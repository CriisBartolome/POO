import java.util.concurrent.atomic.AtomicInteger;

public class VariablesAtomicasContador {

    private AtomicInteger contador;
    
    public VariablesAtomicasContador() {
        contador = new AtomicInteger(0);
    }

    public int getContador() {
        return contador.get();
    }
    
    public int incrementar() {
        return contador.incrementAndGet();
    }
}
