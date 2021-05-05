import java.util.function.Function;

public class FunctionEjemplo {

    public static void main(String[] args) {
        //Ejemplo1
        Function<String, Integer> function1 = variable -> variable.length();
        System.out.println("Longitud de la palabra: " + function1.apply("Hola"));
        System.out.println("Longitud de la palabra: " + function1.apply("Mundo"));
        
        //Ejemplo2
        Function<Integer, Integer> function2 = variable -> variable * 3;
        System.out.println("Resultado: " + function2.apply(5));
        
        //Ejemplo3
        System.out.println("Longitud de la palabra * 3: " + function1.andThen(function2).apply("Cancion"));
    }
}
