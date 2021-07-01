
public class ClienteObservadorConcreto implements ClienteObserver{
    
    private String nombre;
    
    public ClienteObservadorConcreto(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String mensaje) {
        System.out.println(nombre + ", " + mensaje);        
    }

}
