
public class Cliente {
    
    private String nombreCliente;
    private int[] carroCompra;

    public Cliente(String nombreCliente, int[] carroCompra) {
        this.nombreCliente = nombreCliente;
        this.carroCompra = carroCompra;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public int[] getCarroCompra() {
        return carroCompra;
    }

}
