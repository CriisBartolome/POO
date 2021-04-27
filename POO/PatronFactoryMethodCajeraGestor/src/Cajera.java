
public class Cajera extends Thread implements Empleo{

    private String nombre;
    private ClienteTienda cliente;
    private long initialTime;

    public Cajera(String nombre, ClienteTienda cliente, long initialTime) {
        this.nombre = nombre;
        this.cliente = cliente;
        this.initialTime = initialTime;
    }

    @Override
    public void run() {

        System.out.println(this.nombre + " COMIENZA A PROCESAR LA COMPRA DEL " 
                    + this.cliente.getNombreCliente() + " EN EL TIEMPO: " 
                    + (System.currentTimeMillis() - this.initialTime) / 1000 + "seg");

        for (int i = 0; i < this.cliente.getCarroCompra().length; i++) {
            // Se procesa el pedido en X segundos
            this.esperarXsegundos(cliente.getCarroCompra()[i]);
            System.out.println("Procesado el producto " + (i + 1) 
                        + " del cliente " + this.cliente.getNombreCliente() + "->Tiempo: " 
                        + (System.currentTimeMillis() - this.initialTime) / 1000 + "seg");
        }

        System.out.println(this.nombre + " HA TERMINADO DE PROCESAR " 
                        + this.cliente.getNombreCliente() + " EN EL TIEMPO: " 
                        + (System.currentTimeMillis() - this.initialTime) / 1000+ "seg");
        System.out.println("------------------------------------------------------------------");
    }

    private void esperarXsegundos(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}