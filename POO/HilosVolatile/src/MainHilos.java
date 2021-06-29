
public class MainHilos {

    public static void main(String[] args) {
        Volatile hilo1 = new Volatile();
        Volatile hilo2 = new Volatile();
        
        hilo1.start();
        hilo2.start();
        
        hilo2.setValor(4);
        
        try {
            hilo1.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        
        hilo1.setValor(8);
        
        
    }

}
