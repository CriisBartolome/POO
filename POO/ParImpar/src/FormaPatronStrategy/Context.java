package FormaPatronStrategy;

public class Context {

    public Strategy obtenerContexto(int valor1, int valor2) {
        if((valor1 % 2 == 0) && (valor2 % 2 == 0)){
            return new Clase1ParStrategy();
        }
        return new Clase2ImparStrategy();
    }
}
