import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import lombok.AllArgsConstructor;

public class FakeTest {

    //Objeto completamente implementado equivalente al objeto real al que pretende simular,
    //pero que falsea algo para que los test sean más fáciles de probar.
    
    //Simularemos una base de datos usando una lista
    List<Empleado> baseDatosEmpleados;
    
    @AllArgsConstructor
    public class Empleado {
        private String nombre;
        private String apellido;
        private int numeroEmpleado;        
    }
    
    @Before
    public void crearBaseDatos() {
        baseDatosEmpleados = new ArrayList<>();
        baseDatosEmpleados.add(new Empleado("Manuel", "Perez", 1234));
        baseDatosEmpleados.add(new Empleado("Lidia", "Castro", 2345));
        baseDatosEmpleados.add(new Empleado("Alvaro", "Fernandez", 3456));
        baseDatosEmpleados.add(new Empleado("Carolina", "Garcia", 4567));
        
    }
    
    @Test
    public void anadirEmpleado() {
        Empleado empleado = new Empleado("Carlos", "Rodriguez", 5678);
        baseDatosEmpleados.add(empleado);
        Assert.assertEquals(true, baseDatosEmpleados.contains(empleado));
    }
    

}
