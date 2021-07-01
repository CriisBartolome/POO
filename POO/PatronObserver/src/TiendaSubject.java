
public interface TiendaSubject {
    
    public void añadirSeguidor(ClienteObserver observador);
    public void eliminarSeguidor(ClienteObserver observador);
    public void notificarNuevoProducto();

}
