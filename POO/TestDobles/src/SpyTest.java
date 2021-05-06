import org.junit.Assert;
import org.junit.Test;

public class SpyTest {

    //Objetos que registran cierta información sobre las acciones que se realizan sobre ellos
    
    private class Saludo {

        private int repeticiones;
        
        public void saludar(String saludo) {
            repeticiones++;
        }
        
        public int getRepeticiones() {
            return repeticiones;
        }
    }
    
    @Test
    public void numRepeticiones() {
        Saludo saludo = new Saludo();
        saludo.saludar("Hola");
        saludo.saludar("Hola amigo");
        saludo.saludar("Hola vecino");
        Assert.assertEquals(3, saludo.getRepeticiones());
    }

}
