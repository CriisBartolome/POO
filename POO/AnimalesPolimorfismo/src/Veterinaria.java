import java.util.ArrayList;
import java.util.List;

public class Veterinaria {

	List <Animal> listaVeterinaria;
		
	public Veterinaria() {
		listaVeterinaria = new ArrayList<>();
	}

	public void dejarAnimal(Animal animal) {
		listaVeterinaria.add(animal);		
	}
	
	public Animal recogerAnimal(Animal animal) {
		return listaVeterinaria.remove(0);
	}
}
