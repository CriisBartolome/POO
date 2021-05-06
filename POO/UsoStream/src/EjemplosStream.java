import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemplosStream {

    public static void main(String[] args) {
        //Ejemplo1 -> ordenar lista de enteros y mostrarla
        System.out.println("Ejemplo1: ordenar lista y mostrarla");
        List<Integer> listaEnteros = new ArrayList<>();
        listaEnteros = Arrays.asList(8,4,7,2,1,6);
        listaEnteros.stream()
                    .sorted()
                    .forEach(System.out::println);
        
        //Ejemplo2 -> filtrar los elementos mayores que un valor
        System.out.println("Ejemplo2: mostrar los números de la lista mayores que 4");
        listaEnteros.stream()
                    .filter(valor -> valor > 4)
                    .forEach(valor -> System.out.println(valor));
        
        //Ejemplo3 -> mostrar el doble de los elementos
        System.out.println("Ejemplo3: mostrar los números de la lista multiplicados por 2");
        listaEnteros.stream()
                    .map(valor -> valor*2)
                    .forEach(valor -> System.out.println(valor));
        
        //Ejemplo4 -> sumar todos los numeros
        System.out.println("Ejemplo4: sumar los números de la lista");
        int suma = listaEnteros.stream()
                                .reduce(0, Integer::sum);
        System.out.println(suma);
        
        //Ejemplo4 -> contar cuántos numeros hay en la lista
        System.out.println("Ejemplo5: elementos contenidos en la lista");
        System.out.println(listaEnteros.stream()
                                .count());

    }

}
