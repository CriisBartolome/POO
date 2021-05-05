import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class MultiplicacionParametrizacionTest {
    
    @Parameters
    public static Iterable datos(){
        return Arrays.asList(new Object[][]{{2,2,4},{3,2,6},{5,1,5},{5,2,10}});
    }
 
    //Forma1 -> atributos privados y creando un constructor
    /*private int primerTermino;
    private int segundoTermino;
    private int resultado;
 
    public MultiplicacionParametrizacionTest(int primerTermino, int segundoTermino, int resultado ) {
        this.primerTermino = primerTermino;
        this.segundoTermino = segundoTermino;
        this.resultado = resultado;
    }*/
    
    //Forma2 -> atributos públicos, no necesitamos constructor
    @Parameter(value = 0)
    public int primerTermino;
    @Parameter(value = 1)
    public int segundoTermino;
    @Parameter(value = 2)
    public int resultado;
 
    @Test
    public void resultadosMultiplicacion(){
        Assert.assertEquals(resultado, primerTermino * segundoTermino);
        System.out.println(primerTermino + " * " + segundoTermino +" = "+ resultado);
    }

}
