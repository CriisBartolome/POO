import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerEjemplo {

    public static void main(String[] args) {
        //Ejemplo1
        Consumer<String> consumer1 = variable -> System.out.print(variable + " ");
        consumer1.accept("Hola");
        consumer1.accept("Mundo");
        System.out.println();
        
        //Ejemplo2
        List<Integer> listaEnteros = new ArrayList<>();
        listaEnteros.add(3);
        listaEnteros.add(2);
        listaEnteros.add(1);
        Consumer<Integer> consumer2 = variable -> System.out.print(variable + " ");
        iterar(listaEnteros, consumer2);
        
    }

    private static void iterar(List<Integer> listaEnteros, Consumer<Integer> consumer2) {
       for(Integer elemento: listaEnteros) {
           consumer2.accept(elemento);
       }
        
    }

}
