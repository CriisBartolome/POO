
public class Facade implements FacadeInterface{

    private Circulo circulo;
    private Cuadrado cuadrado;
    private Rectangulo rectangulo;
    
    public Facade() {
        circulo = new Circulo();
        cuadrado = new Cuadrado();
        rectangulo = new Rectangulo();
    }
    
    @Override
    public void dibujarCirculo() {
        circulo.dibujar();
    }
    
    @Override
    public void dibujarCuadrado() {
        cuadrado.dibujar();
    }
    
    @Override
    public void dibujarRectangulo() {
        rectangulo.dibujar();
    }
    
    @Override
    public void dibujarTodos() {
        circulo.dibujar();
        cuadrado.dibujar();
        rectangulo.dibujar();
    }
}
