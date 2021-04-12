import java.util.ArrayList;
import java.util.List;

public class AnimalesPolimorfismo {

	public static void main(String[] args) {
		Animal gato = new Gato();
		Animal perro = new Perro();
		List <Animal> listaAnimales = new ArrayList<>();
		listaAnimales.add(perro);
		listaAnimales.add(gato);
		for (Animal animal: listaAnimales) {
			System.out.println(animal.sonido());
		}
		
		//System.out.println(gato.sonido());
		//System.out.println(perro.sonido());
	}

}
