
public class MainObserver {

    public static void main(String[] args) {

        TiendaSubject tienda = new TiendaSujetoConcreto();

        ClienteObserver cliente1 = new ClienteObservadorConcreto("Maria");
        ClienteObserver cliente2 = new ClienteObservadorConcreto("Lucas");
        ClienteObserver cliente3 = new ClienteObservadorConcreto("Carmen");

        // Añadimos tres clientes a la tienda
        tienda.añadirSeguidor(cliente1);
        tienda.añadirSeguidor(cliente2);
        tienda.añadirSeguidor(cliente3);

        // Notificamos de un nuevo producto
        tienda.notificarNuevoProducto();

        // Damos de baja a un cliente
        tienda.eliminarSeguidor(cliente1);

        // Notificamos de un nuevo producto
        tienda.notificarNuevoProducto();
    }
}
