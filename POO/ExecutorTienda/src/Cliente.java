
public class Cliente {
    
    private String nombreCliente;
    private int[] carroCompra;
    
    public Cliente() {
        
    }

    public Cliente(String nombreCliente, int[] carroCompra) {
        this.nombreCliente = nombreCliente;
        this.carroCompra = carroCompra;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int[] getCarroCompra() {
        return carroCompra;
    }

    public void setCarroCompra(int[] carroCompra) {
        this.carroCompra = carroCompra;
    }

}
