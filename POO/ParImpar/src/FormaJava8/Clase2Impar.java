package FormaJava8;
import java.time.LocalDateTime;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Clase2Impar {

    public void metodo1(int valor1, int valor2) {
        Predicate<Integer> impar = valor -> valor % 2 != 0;
        BiFunction<Integer, Integer,Integer> multiplicar = (elem1, elem2) -> elem1 * elem2;
        Supplier<LocalDateTime> hora = () -> LocalDateTime.now();
        Consumer<String> escribir = objeto -> System.out.println(objeto);
        
        if(impar.test(valor1) && impar.test(valor2)) {
            int multiplicacion = multiplicar.apply(valor1, valor2);
            escribir.accept("La multiplicación de " + valor1 + " * " + valor2 + " = " + multiplicacion);
            escribir.accept("Hora actual: " + hora.get().getHour() + ":" + hora.get().getMinute() + ":" + hora.get().getSecond());           
        }
        else {
            escribir.accept("No se ha podido realizar la operación");
        }
    }
}
