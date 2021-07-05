
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class Clase2SpyTest {

    @InjectMocks
    private Clase2 clase2;

    @Spy
    private Clase3 clase3;

    @Captor
    private ArgumentCaptor<String> captor;

    @Test
    public void test() {
        Mockito.when(clase3.setNombre2("Maria")).thenReturn("Luisa");
        System.out.println(clase2.getClase3().setNombre2("Maria"));

        Mockito.when(clase3.setNombre2(captor.capture())).thenReturn("Luisa");
        clase2.getClase3().setNombre2("Test");
        clase2.getClase3().setNombre2("Test2");
        captor.getAllValues();

        System.out.println(clase2.getClase3().getNombre());
        System.out.println(clase2.getClase3().getEdad());

    }

}
