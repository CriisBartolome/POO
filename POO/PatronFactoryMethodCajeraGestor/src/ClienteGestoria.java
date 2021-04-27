
public class ClienteGestoria implements Cliente{
    
    private String nombreCliente;
    private String DNI;
    private int edad;
    
    public String getNombreCliente() {
        return nombreCliente;
    }
    
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    
    public String getDNI() {
        return DNI;
    }
    
    public void setDNI(String dNI) {
        DNI = dNI;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
        
}
