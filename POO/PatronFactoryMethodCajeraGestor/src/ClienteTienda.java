
public class ClienteTienda implements Cliente{
    
    private String nombreCliente;
    private int[] carroCompra;

    public ClienteTienda(String nombreCliente, int[] carroCompra) {
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
