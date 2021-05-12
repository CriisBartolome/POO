package FormaPatronStrategy;
public class Main {

    public static void main(String[] args) {
        Strategy estrategia;
        Context contexto = new Context();
        
        int valor1 = 4;
        int valor2 = 6;
        estrategia = contexto.obtenerContexto(valor1, valor2);
        estrategia.metodo1(valor1, valor2);
        
        valor1 = 3;
        valor2 = 5;
        estrategia = contexto.obtenerContexto(valor1, valor2);
        estrategia.metodo1(valor1, valor2);
        
        valor1 = 2;
        valor2 = 3;
        estrategia = contexto.obtenerContexto(valor1, valor2);
        estrategia.metodo1(valor1, valor2);
        
    }

}
