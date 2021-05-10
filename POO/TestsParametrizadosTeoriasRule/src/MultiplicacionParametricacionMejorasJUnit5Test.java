import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class MultiplicacionParametricacionMejorasJUnit5Test {   
    
    private static Stream<Arguments> datos() {
      return Stream.of(
        Arguments.of(2, 2, 4),
        Arguments.of(3, 2, 6),
        Arguments.of(5, 1, 5),
        Arguments.of(5, 2, 10));
    }
    
    @ParameterizedTest
    @MethodSource("datos")
    public void multiplicacion(int primerTermino, int segundoTermino, int resultado) {
        Assertions.assertEquals(resultado, primerTermino * segundoTermino);
        System.out.println(primerTermino + " * " + segundoTermino + " = " + resultado);
    }

}
