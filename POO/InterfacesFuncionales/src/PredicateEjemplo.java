import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateEjemplo {

    public static void main(String[] args) {
        //Ejemplo1
        Predicate<Integer> mayoresQue5 =  variable -> variable > 5;
        System.out.println(mayoresQue5.test(3));
        System.out.println(mayoresQue5.test(8));
        
        //Ejemplo2
        List<Integer> listaEnteros = new ArrayList<>();
        listaEnteros.add(2);
        listaEnteros.add(6);
        listaEnteros.add(7);
        listaEnteros.add(5);
        iterar(listaEnteros, mayoresQue5);
        
    }

    private static void iterar(List<Integer> listaEnteros, Predicate<Integer> mayoresQue5) {
        for(Integer elemento : listaEnteros) {
            if(mayoresQue5.test(elemento)) {
                System.out.println(elemento + " es mayor que 5");
            }
            else {
                System.out.println(elemento + " es menor o igual que 5");
            }
        }
        
    }

}
