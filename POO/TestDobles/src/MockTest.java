import org.junit.Assert;
import org.junit.Test;

public class MockTest {
    
    //Es un stub en el que sus métodos sí que implementan un comportamiento, pues se 
    //espera que reciban unos valores y, en función de ellos, se va a devolver una respuesta

    private class Temperatura {
        
        int grados;

        //Defino el comportamiento de un método con todas las opciones posibles
        public String leerTemperatura() {
            if(this.grados <= 10) {
                return "Hace frio";
            }
            else if(this.grados >= 30) {
                return "Hace calor";
            }
            return "Temperatura normal";
        }
        
        public String haceCalor(int grados) {
            setGrados(grados);
            return leerTemperatura();            
        }
        
        public void setGrados(int grados) {
            this.grados = grados;
        }
    }
    
    @Test
    public void haceCalor() {
        Temperatura temperatura = new Temperatura();
        Assert.assertEquals("Hace frio", temperatura.haceCalor(8));
        Assert.assertEquals("Hace calor", temperatura.haceCalor(30));
        Assert.assertEquals("Temperatura normal", temperatura.haceCalor(23));
    }

}
