
public class MainSingleton {

    public static void main(String[] args) {
        ConexionSingleton conexionH2 = ConexionSingleton.getSingletonInstance("H2 database");
        ConexionSingleton conexionSQL = ConexionSingleton.getSingletonInstance("SQL database");
        
        // Vamos a ver que realmente solo se ha creado una conexion y es la misma
        System.out.println(conexionH2.getNombreConexion());
        System.out.println(conexionSQL.getNombreConexion()); 

    }

}
