package FormaPatronTemplateMethodJava8;

import java.time.LocalDateTime;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public abstract class AbstractClass {

    //metodoEsqueleto
        //Condicion de clase especifica
            //Si es verdadera -> se ejecuta una operacion de la clase especifica
            //                -> después escribimos el resultado con el esquema de la superclase
            //                -> también el localdate y su mensaje
            //Si es falsa -> es de la superclase
    
    public void metodoEsqueleto(int valor1, int valor2) {       
        Predicate <Integer> condicion = condicion();
        BiFunction<Integer, Integer,Integer> operacion = operacion();
        Supplier<LocalDateTime> hora = () -> LocalDateTime.now();
        Consumer<String> escribir = System.out::println;
        
        if (condicion.test(valor1) && condicion.test(valor2)) {
            escribir.accept("El resultado es " + operacion.apply(valor1, valor2) );
            escribir.accept("Hora actual: " + hora.get().getHour() + ":" + hora.get().getMinute() + ":" + hora.get().getSecond());
        }
        else {
            escribir.accept("No se ha podido realizar la operación");
        }        
    }
    
    public abstract Predicate<Integer> condicion();
    
    public abstract BiFunction<Integer, Integer, Integer> operacion();
    
}
