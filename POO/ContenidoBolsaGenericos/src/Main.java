
public class Main {

	public static void main(String[] args) {
		Articulo<Lapiz> articulo = new Articulo<Lapiz>();
		Lapiz lapiz = new Lapiz();
		lapiz.setMarca("alpino");
		//articulo.setT(lapiz);
		System.out.println(articulo.getT().getMarca());
		
		Articulo<Cera> articuloCera = new Articulo<>();
		Cera cera = new Cera();
		cera.setMarca("manley");
		articuloCera.setT(cera);
		System.out.println(articuloCera.getT().getMarca());
		
		
	}
}
