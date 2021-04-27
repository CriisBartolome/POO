//ConcreteFactory
public class CrearEmpleoFactory implements Factory{

  //factoryMethod(): Product
    @Override
    public Empleo realizarTrabajo(TipoEmpleo tipo, String nombre, Cliente cliente, long initialTime) {
        
        return tipo.realizarTrabajo(nombre, cliente, initialTime);
        
    }

}
