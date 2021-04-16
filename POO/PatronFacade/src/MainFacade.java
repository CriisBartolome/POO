
public class MainFacade {

    public static void main(String[] args) {
        Facade facade = new Facade();
        
        facade.dibujarRectangulo();
        facade.dibujarCuadrado();
        facade.dibujarCirculo();        
        
        System.out.println();
        facade.dibujarTodos();

    }

}
