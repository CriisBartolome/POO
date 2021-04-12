
public class Contenido {

	public static void listarObjetos(BolsaGenerica<Object> bolsa) {
		System.out.println("Contenido actual de la bolsa");
		for(Object objeto: bolsa.getListaObjetos()) {
			if(objeto.getClass() == Celo.class) {
				Celo celo = (Celo) objeto;
				System.out.println(celo.getMarca());
			}
			else if(objeto.getClass() == Cera.class) {
				Cera cera = (Cera) objeto;
				System.out.println(cera.getMarca());
			}
			else if(objeto.getClass() == Lapiz.class) {
				Lapiz lapiz = (Lapiz) objeto;
				System.out.println(lapiz.getMarca());
			}
		}
	}
	
	public static void main(String[] args) {
		BolsaGenerica<Object> bolsa = new BolsaGenerica<Object>();
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
