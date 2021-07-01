
public class VariablesAtomicasThread extends Thread{

    private final VariablesAtomicasContador contador;
    
    public VariablesAtomicasThread(VariablesAtomicasContador contador){  
        this.contador = contador;         
    }  
    
    public void run(){
        int valorAnterior = contador.getContador();
        System.out.println("[Thread " + Thread.currentThread().getId() + "]: Valor anterior = " + valorAnterior);
        int valorActual = contador.incrementar();
        System.out.println("[Thread " + Thread.currentThread().getId() + "]: Valor actual = " + valorActual);
    }  
}
