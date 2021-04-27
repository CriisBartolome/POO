
public interface Factory {

    //factoryMethod(): Product
    public Empleo realizarTrabajo(TipoEmpleo tipo, String nombre, Cliente cliente, long initialTime);
}
