package FormaPatronTemplateMethodJava8;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public abstract class AbstractClass {

    //metodoEsqueleto
        //Condicion de clase especifica
            //Si es verdadera -> se ejecuta una operacion de la clase especifica
            //                -> despu?s escribimos el resultado con el esquema de la superclase
            //                -> tambi?n el localdate y su mensaje
            //Si es falsa -> es de la superclase
    
    public void metodoEsqueleto(int valor1, int valor2) {       
        Predicate <Integer> condicion = condicion();
        BiFunction<Integer, Integer,Integer> operacion = operacion();
        Supplier<LocalDateTime> hora = () -> LocalDateTime.now();
        Consumer<String> escribir = System.out::println;
        
        String resultado = Optional.of(valor1)
                .filter(condicion)
                .map(valor -> valor2)
                .filter(condicion)
                .map(valor -> "El resultado es " + operacion.apply(valor1, valor2)
                              + "\nHora actual: " + hora.get().getHour() + ":" 
                              + hora.get().getMinute() + ":" + hora.get().getSecond())
                .orElse("No se ha podido realizar la operaci?n");
        escribir.accept(resultado);
        
        /*if (Optional.of(valor1)
                    .filter(condicion)
                    .isPresent() 
            && 
            Optional.of(valor1)
                    .filter(condicion)
                    .isPresent()) {
            escribir.accept("El resultado es " + operacion.apply(valor1, valor2) );
            escribir.accept("Hora actual: " + hora.get().getHour() + ":" + hora.get().getMinute() + ":" + hora.get().getSecond());
        }
        else {
            escribir.accept("No se ha podido realizar la operaci?n");
        }  */      
    }
    
    public abstract Predicate<Integer> condicion();
    
    public abstract BiFunction<Integer, Integer, Integer> operacion();
    
}
