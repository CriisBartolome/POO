import java.util.ArrayList;
import java.util.List;

public class TiendaSujetoConcreto implements TiendaSubject{
    
    private List<ClienteObserver> clientes = new ArrayList<>();

    @Override
    public void a�adirSeguidor(ClienteObserver cliente) {
        clientes.add(cliente);
        System.out.println("Nuevo cliente a�adido");
    }

    @Override
    public void eliminarSeguidor(ClienteObserver cliente) {
        clientes.remove(cliente);
        System.out.println("Cliente eliminado");
    }

    @Override
    public void notificarNuevoProducto() {
        clientes.forEach(cliente -> cliente.actualizar("hay un nuevo producto disponible"));               
    }

}
