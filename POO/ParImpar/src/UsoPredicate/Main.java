package UsoPredicate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    
    //Este método hace lo mismo que el encadenamiento de sentencias del main
    public static int metodo(int entero) {
        if(entero % 2 == 0) {
            return entero;
        }
        else {
            return 10;
        }
    }

    public static void main(String[] args) {
        Predicate<Integer> par = valor -> valor % 2 == 0;
        Integer entero = null;
        Integer dato = Optional.ofNullable(entero)
                .filter(par)
                .orElse(10);
        System.out.println(dato);
        
        List<Integer> listaEnteros = Arrays.asList(2, 3, 4);
        listaEnteros.stream()
                    .filter(par)
                    .collect(Collectors.toList())
                    .forEach(System.out::println);
    }
}
