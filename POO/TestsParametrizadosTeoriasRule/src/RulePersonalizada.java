import java.time.LocalDateTime;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class RulePersonalizada implements TestRule {

    @Override
    public Statement apply(Statement base, Description description) {
        return new Statement() {
            @Override
            public void evaluate() throws Throwable {
                LocalDateTime hora = LocalDateTime.now();
                double tiempoInicial = System.currentTimeMillis();
                System.out.println(
                        "Hola mundo, la hora es " + hora.getHour() + ":" + hora.getMinute() + ":" + hora.getSecond());
                try {
                    base.evaluate();
                } finally {
                    double tiempoFinal = System.currentTimeMillis();
                    System.out.println("El test " + description.getMethodName() + " ha tardado en ejecutarse "
                            + (tiempoFinal - tiempoInicial) * Math.pow(10, -3) + " segundos");
                    System.out.println("-------------------------------------------------------");
                }
            }
        };
    }

}
