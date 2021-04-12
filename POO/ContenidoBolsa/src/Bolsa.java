import java.util.ArrayList;
import java.util.List;

public class Bolsa {

	private List <Objetos> listaObjetos;
	
	public Bolsa() {
		listaObjetos = new ArrayList<>();
	}
	
	public List<Objetos> getListaObjetos() {
		return listaObjetos;
	}

	public void anadirObjeto(Objetos object) {
		listaObjetos.add(object);
		System.out.println("Objeto "+ object.getMarca() +" añadido a la bolsa");
	}
	
	public boolean sacarObjeto(Objetos object) {
		for(Object elemento: listaObjetos) {
			if(elemento == object) {
				System.out.println("Borrando objeto "+ object.getMarca());
				return listaObjetos.remove(elemento);
			}
		}
		System.out.println("No se ha borrado ningún objeto");
		return false;		
	}
}
