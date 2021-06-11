
public class ConexionSingleton {

    private String nombreConexion;
    private static ConexionSingleton conexion;
    
    private ConexionSingleton(String nombreConexion) {
        this.nombreConexion = nombreConexion;
        System.out.println("Conexión con " + this.nombreConexion + " realizada");
    }
    
    public static ConexionSingleton getSingletonInstance(String nombreNuevaConexion) {
        if (conexion == null){
            conexion = new ConexionSingleton(nombreNuevaConexion);
        }
        else{
            System.out.println("Ya existe una conexion. No se puede conectar con " + nombreNuevaConexion);
        }
        
        return conexion;
    }

    public String getNombreConexion() {
        return nombreConexion;
    }

}
