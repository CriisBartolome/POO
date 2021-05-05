import java.time.LocalDateTime;
import java.util.function.Supplier;

public class ProducerEjemplo {
    
    public static void main(String[] args) {
        Supplier<LocalDateTime> supplier = () -> LocalDateTime.now();
        System.out.println("Fecha y hora actual: " + supplier.get());
    }

}
