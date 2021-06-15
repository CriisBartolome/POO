
public enum EnumSingleton {

    INSTANCIA("Sin conexion");
    
    private String nombreConexion;
    
    private EnumSingleton(String nombreConexion) {
        this.setNombreConexion(nombreConexion);
    }
 
    public EnumSingleton getInstancia() {
        return INSTANCIA;
    }

    public String getNombreConexion() {
        return nombreConexion;
    }

    public void setNombreConexion(String nombreConexion) {
        this.nombreConexion = nombreConexion;
    }
}
