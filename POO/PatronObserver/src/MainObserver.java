
public class MainObserver {

    public static void main(String[] args) {

        TiendaSubject tienda = new TiendaSujetoConcreto();

        ClienteObserver cliente1 = new ClienteObservadorConcreto("Maria");
        ClienteObserver cliente2 = new ClienteObservadorConcreto("Lucas");
        ClienteObserver cliente3 = new ClienteObservadorConcreto("Carmen");

        // A�adimos tres clientes a la tienda
        tienda.a�adirSeguidor(cliente1);
        tienda.a�adirSeguidor(cliente2);
        tienda.a�adirSeguidor(cliente3);

        // Notificamos de un nuevo producto
        tienda.notificarNuevoProducto();

        // Damos de baja a un cliente
        tienda.eliminarSeguidor(cliente1);

        // Notificamos de un nuevo producto
        tienda.notificarNuevoProducto();
    }
}
