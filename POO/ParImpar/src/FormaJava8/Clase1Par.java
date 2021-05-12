package FormaJava8;
import java.time.LocalDateTime;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Clase1Par {

    public void metodo1(int valor1, int valor2) {
        Predicate<Integer> par = valor -> valor % 2 == 0;
        BiFunction<Integer, Integer,Integer> sumar = (elem1, elem2) -> elem1 + elem2;
        Supplier<LocalDateTime> hora = () -> LocalDateTime.now();
        Consumer<String> escribir = System.out::println;
        
        if(par.test(valor1) && par.test(valor2)) {
            int suma = sumar.apply(valor1, valor2);
            escribir.accept("La suma de " + valor1 + " + " + valor2 + " = " + suma);
            escribir.accept("Hora actual: " + hora.get().getHour() + ":" + hora.get().getMinute() + ":" + hora.get().getSecond());           
        }
        else {
            escribir.accept("No se ha podido realizar la operación");
        }
    }
}
