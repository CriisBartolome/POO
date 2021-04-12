
public class Contenido {

	public static void listarObjetos(Bolsa bolsa) {
		System.out.println("Contenido actual de la bolsa");
		for(Objetos objeto: bolsa.getListaObjetos()) {
			System.out.println(objeto.getMarca());
		}
	}
	
	public static void main(String[] args) {
		Bolsa bolsa = new Bolsa();
		Lapiz lapiz1 = new Lapiz();
		lapiz1.setMarca("alpino");
		Lapiz lapiz2 = new Lapiz();
		lapiz2.setMarca("staedtler");
		Cera cera1 = new Cera();
		cera1.setMarca("manley");
		Cera cera2 = new Cera();
		cera2.setMarca("bic");
		Celo celo1 = new Celo();
		celo1.setMarca("amarillo");
		Celo celo2 = new Celo();
		celo2.setMarca("blanco");
		
		bolsa.anadirObjeto(lapiz1);
		bolsa.anadirObjeto(lapiz2);
		bolsa.anadirObjeto(cera1);
		listarObjetos(bolsa);
		
		bolsa.sacarObjeto(lapiz2);
		listarObjetos(bolsa);
		
		bolsa.anadirObjeto(cera2);
		bolsa.anadirObjeto(celo1);
		bolsa.anadirObjeto(celo2);
		listarObjetos(bolsa);
		
		bolsa.sacarObjeto(lapiz1);
		bolsa.sacarObjeto(celo1);
		bolsa.sacarObjeto(celo2);
		listarObjetos(bolsa);
	}

}
