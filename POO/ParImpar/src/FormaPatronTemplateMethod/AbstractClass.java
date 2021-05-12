package FormaPatronTemplateMethod;

import java.time.LocalDateTime;

public abstract class AbstractClass {

    //metodoEsqueleto
        //Condicion de clase especifica
            //Si es verdadera -> se ejecuta una operacion de la clase especifica
            //                -> después escribimos el resultado con el esquema de la superclase
            //                -> también el localdate y su mensaje
            //Si es falsa -> es de la superclase
    
    public void metodoEsqueleto(int valor1, int valor2) {       
        if(condicion(valor1, valor2)) {           
            System.out.println("El resultado es " + operacion(valor1, valor2) );
            LocalDateTime hora = LocalDateTime.now();
            System.out.println("Hora actual: " + hora.getHour() + ":" + hora.getMinute() + ":" + hora.getSecond());
        }
        else {
            System.out.println("No se ha podido realizar la operación");
        }        
    }
    
    public abstract boolean condicion(int valor1, int valor2);
    
    public abstract int operacion(int valor1, int valor2);
    
}
