//Clase Proxy que implementa la interfaz y nos ayuda a tratar el sujeto
public class InformacionProxy implements Informacion{

    private static final String ADMIN = "Administrador";
    private InformacionReal infoReal;
    private String usuario;
    
    public InformacionProxy(String usuario) {
        this.usuario = usuario;
    }
    
    @Override
    public void mostrarInformacion() {
        System.out.println("Usuario: " + usuario);
        if(usuario.equalsIgnoreCase(ADMIN)) {
            infoReal = new InformacionReal();            
            infoReal.mostrarInformacion();
        }
        else {
            System.out.println("Usuario sin permisos. Informacion restringida");
        }
    }

}
