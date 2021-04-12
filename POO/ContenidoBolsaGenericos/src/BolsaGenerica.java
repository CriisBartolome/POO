import java.util.ArrayList;
import java.util.List;

public class BolsaGenerica <T>{

private List <T> listaObjetos;
	
	public BolsaGenerica() {
		listaObjetos = new ArrayList<T>();
	}
	
	public List<T> getListaObjetos() {
		return listaObjetos;
	}

	public void anadirObjeto(T object) {
		listaObjetos.add(object);
		if(object.getClass() == Celo.class) {
			Celo celo = (Celo) object;
			System.out.println("Objeto "+ celo.getMarca() +" añadido a la bolsa");
		}
		else if(object.getClass() == Cera.class) {
			Cera cera = (Cera) object;
			System.out.println("Objeto "+ cera.getMarca() +" añadido a la bolsa");
		}
		else if(object.getClass() == Lapiz.class) {
			Lapiz lapiz = (Lapiz) object;
			System.out.println("Objeto "+ lapiz.getMarca() +" añadido a la bolsa");
		}
	}
	
	public boolean sacarObjeto(T object) {
		for(Object elemento: listaObjetos) {
			if(elemento == object) {
				if(object.getClass() == Celo.class) {
					Celo celo = (Celo) object;
					System.out.println("Borrando objeto "+ celo.getMarca());
				}
				else if(object.getClass() == Cera.class) {
					Cera cera = (Cera) object;
					System.out.println("Borrando objeto "+ cera.getMarca());
				}
				else if(object.getClass() == Lapiz.class) {
					Lapiz lapiz = (Lapiz) object;
					System.out.println("Borrando objeto "+ lapiz.getMarca());
				}
				
				return listaObjetos.remove(elemento);
			}
		}
		System.out.println("No se ha borrado ningún objeto");
		return false;		
	}
}
