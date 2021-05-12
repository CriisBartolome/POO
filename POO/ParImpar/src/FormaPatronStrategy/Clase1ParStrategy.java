package FormaPatronStrategy;
import java.time.LocalDateTime;

public class Clase1ParStrategy implements Strategy{

    public void metodo1(int valor1, int valor2) {
        if((valor1 % 2 == 0) && (valor2 % 2 == 0)){
            int suma = valor1 + valor2;
            System.out.println("La suma de " + valor1 + " + " + valor2 + " = " + suma);
            LocalDateTime hora = LocalDateTime.now();
            System.out.println("Hora actual: " + hora.getHour() + ":" + hora.getMinute() + ":" + hora.getSecond());
        }
        else {
            System.out.println("No se ha podido realizar la operación");
        }
    }
}
