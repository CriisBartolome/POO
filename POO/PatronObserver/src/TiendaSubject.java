
public interface TiendaSubject {
    
    public void aņadirSeguidor(ClienteObserver observador);
    public void eliminarSeguidor(ClienteObserver observador);
    public void notificarNuevoProducto();

}
