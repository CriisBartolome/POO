
public enum TipoEmpleo {

    CAJERA {
        @Override
        public Empleo realizarTrabajo(String nombre, Cliente cliente, long initialTime) {
            ClienteTienda clienteTienda =  (ClienteTienda) cliente;
            return new Cajera(nombre, clienteTienda, initialTime);
        }
    }, GESTOR {
        @Override
        public Empleo realizarTrabajo(String nombre, Cliente cliente, long initialTime) {
            ClienteGestoria clienteGestoria = (ClienteGestoria) cliente;
            return new Gestor(nombre, clienteGestoria);
        }
    };
    
    public abstract Empleo realizarTrabajo(String nombre, Cliente cliente, long initialTime);
}
