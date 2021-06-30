
public class VolatileThread extends Thread{
    
    private final VolatileContador contador;
    
    public VolatileThread(VolatileContador contador){  
        this.contador = contador;         
    }  
    
    public void run(){
        int valorAnterior = contador.getContador();
        System.out.println("[Thread " + Thread.currentThread().getId() + "]: Valor anterior = " + valorAnterior);
        contador.incrementar();
        int valorActual = contador.getContador();
        System.out.println("[Thread " + Thread.currentThread().getId() + "]: Valor actual = " + valorActual);
    }  
    
}
