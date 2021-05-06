import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class DummyTest {

    //Objeto necesario para ejecutar un test pero que no interviene en la funcionalidad
    //que estamos comprobando. Son objetos de relleno.
    
    @Test
    public void size() {
        List<List<Integer>> listaEnteros = new ArrayList<>();
        //Creo los dummy, que son las listas. No me importa su contenido
        listaEnteros.add(new ArrayList<>());
        listaEnteros.add(new ArrayList<>());
        listaEnteros.add(new ArrayList<>());
        listaEnteros.add(new ArrayList<>());
        Assert.assertEquals(4, listaEnteros.size());
    }

}
