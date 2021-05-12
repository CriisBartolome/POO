package FormaPatronTemplateMethodJava8;

import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Clase1Par extends AbstractClass{

    @Override
    public Predicate<Integer> condicion() {
        return valor -> valor % 2 == 0;
    }

    @Override
    public BiFunction<Integer, Integer, Integer> operacion() {
        return (valor1, valor2) -> valor1 + valor2;
    }

    

}
