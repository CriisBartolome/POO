import java.util.Random;

import org.junit.Assert;
import org.junit.Test;

public class StubTest {

    //Objetos parecidos a los dummy pero que proporcionan respuestas predefinidas 
    //a llamadas realizadas durante los test.
    
    public interface Temperatura{
        int leerTemperatura();
        boolean haceCalor();
    }
    
    private class TemperaturaReal implements Temperatura{

        //He definido un valor fijo de temperatura porque quiero probar el método haceCalor()
        //No tengo un método que obtenga la temperatura real por lo que le doy un valor por defecto
        public int leerTemperatura() {
            return new Random().nextInt();
        }
        
        public boolean haceCalor() {
            return leerTemperatura() > 25;            
        }
    }
    
    private class TemperaturaStub implements Temperatura{

        //He definido un valor fijo de temperatura porque quiero probar el método haceCalor()
        //No tengo un método que obtenga la temperatura real por lo que le doy un valor por defecto
        public int leerTemperatura() {
            return 24;
        }
        
        public boolean haceCalor() {
            return leerTemperatura() > 25;            
        }
    }
    
    public class Meteorologia{
        
        Temperatura temperatura;
        
        public Meteorologia(Temperatura temperatura) {
            this.temperatura = temperatura;
        }
        
        public void mostrarTemperatura() {
            System.out.println(temperatura.leerTemperatura());
        }
    }
    
    @Test
    public void haceCalor() {
        Temperatura temperatura = new TemperaturaStub();
        Meteorologia meteo = new Meteorologia(temperatura);
        meteo.mostrarTemperatura();
        Assert.assertEquals(false, temperatura.haceCalor());
    }

}
