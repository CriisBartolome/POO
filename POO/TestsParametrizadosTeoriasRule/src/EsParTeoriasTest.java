import org.junit.Assert;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class EsParTeoriasTest {

    @DataPoints
    public static int[] numeros1 = {1,3,5};   
    
    @Theory
    public void esPar(int numero1, int numero2) {
        System.out.println(numero1 + " + " + numero2);
        Assert.assertEquals(true, (numero1 + numero2) % 2 == 0);
    }
}
