
public class Venta {
	
	public static void listarZapatosTienda(TiendaZapatos tiendaZapatos) {
		System.out.println("Zapatos disponibles");
		for(Zapato zapato : tiendaZapatos.getProductosDisponibles()) {
			System.out.println("Modelo " + zapato.getModelo());
		}
	}
	
	public static void listarZapatosCliente(Cliente cliente) {
		System.out.println("Zapatos comprados por " + cliente.getNombre());
		for(Zapato zapato : cliente.getCompras()) {
			System.out.println("Modelo " + zapato.getModelo());
		}
	}

	public static void main(String[] args) {
		TiendaZapatos tiendaZapatos = new TiendaZapatos();
		//TiendaZapatos tienda = new TiendaZapatos();
		
		Zapato zapato1 = new Zapato(1, "L", 40);
		Zapato zapato2 = new Zapato(2, "L", 50);
		Zapato zapato3 = new Zapato(3, "XL", 30);
		
		Cliente cliente1 = new Cliente("Paco", "Fernandez");
		Cliente cliente2 = new Cliente("María", "Lopez");
		Cliente cliente3 = new Cliente("Carlos", "Perez");
		
		tiendaZapatos.anadirZapato(zapato1);
		tiendaZapatos.anadirZapato(zapato2);
		tiendaZapatos.anadirZapato(zapato3);
		listarZapatosTienda(tiendaZapatos);
		
		try {
            cliente1.Comprar(zapato1, tiendaZapatos);
        } catch (Exception e) {
            e.printStackTrace();
        }
		listarZapatosTienda(tiendaZapatos);
		listarZapatosCliente(cliente1);
		
		try {
            cliente2.Comprar(zapato1, tiendaZapatos);
        } catch (Exception e) {
            e.printStackTrace();
        }
		listarZapatosTienda(tiendaZapatos);
		listarZapatosCliente(cliente2);
		
		try {
            cliente3.Comprar(zapato3, tiendaZapatos);
        } catch (Exception e) {
            e.printStackTrace();
        }
		listarZapatosTienda(tiendaZapatos);
		listarZapatosCliente(cliente3);

	}

}
