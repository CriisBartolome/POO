import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class MultiplicacionParametrizacionMejorasJUnit5LeerArchivoTest {

    @ParameterizedTest
    //Usado para especificar valores en formato csv contenidos en un fichero
    @CsvFileSource(resources = "/datos.csv")
    public void multiplicacion(int primerTermino, int segundoTermino, int resultado) {
        Assertions.assertEquals(resultado, primerTermino * segundoTermino);
        System.out.println(primerTermino + " * " + segundoTermino + " = " + resultado);
    }

}
