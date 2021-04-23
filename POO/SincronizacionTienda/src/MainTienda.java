
public class MainTienda {

    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente("Cliente 1", new int[] { 1, 1, 1, 5, 2, 3 });
        Cliente cliente2 = new Cliente("Cliente 2", new int[] { 3, 3, 5, 1, 4 });

        // Tiempo inicial de referencia
        long initialTime = System.currentTimeMillis();
        Thread cajera1 = new Cajera("Cajera 1", cliente1, initialTime);
        Thread cajera2 = new Cajera("Cajera 2", cliente2, initialTime);

        System.out.println("Inicio de las compras");
        System.out.println("----------------------------------------------------------------");
        
        cajera1.start();
        cajera2.start();
        
        while(cajera1.isAlive() || cajera2.isAlive()) {
            
        }
        
        System.out.println("Compras procesadas");
    }
        
        
}
