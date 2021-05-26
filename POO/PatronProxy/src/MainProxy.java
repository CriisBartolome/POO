
public class MainProxy {

    public static void main(String[] args) {
        Informacion info1 = new InformacionProxy("administrador");
        info1.mostrarInformacion();
        
        Informacion info2 = new InformacionProxy("Administrador");
        info2.mostrarInformacion();
        
        Informacion info3 = new InformacionProxy("usuario");
        info3.mostrarInformacion();

    }

}
