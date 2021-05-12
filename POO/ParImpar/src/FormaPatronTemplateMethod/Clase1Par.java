package FormaPatronTemplateMethod;

public class Clase1Par extends AbstractClass{

    @Override
    public boolean condicion(int valor1, int valor2) {
        return ((valor1 % 2 == 0) && (valor2 % 2 == 0));
    }

    @Override
    public int operacion(int valor1, int valor2) {
        return valor1 + valor2;
    }

}
