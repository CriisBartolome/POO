import org.junit.Assert;
import org.junit.Test;

public class StubTest {

    //Objetos parecidos a los dummy pero que proporcionan respuestas predefinidas 
    //a llamadas realizadas durante los test.
    
    private class Temperatura {

        //He definido un valor fijo de temperatura porque quiero probar el método haceCalor()
        //No tengo un método que obtenga la temperatura real por lo que le doy un valor por defecto
        public int leerTemperatura() {
            return 24;
        }
        
        public boolean haceCalor() {
            return leerTemperatura() > 25;            
        }
    }
    
    @Test
    public void haceCalor() {
        Temperatura temperatura = new Temperatura();
        Assert.assertEquals(false, temperatura.haceCalor());
    }

}
