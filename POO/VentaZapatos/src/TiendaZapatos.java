import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

public class TiendaZapatos {

    @Getter
	private List<Zapato> productosDisponibles;
	
	{System.out.println("Bloque inicialización");}
	
	static {
		System.out.println("Bloque estatico");
	}
	
	public TiendaZapatos() {
		productosDisponibles = new ArrayList<>();
		System.out.println("Mi constructor");
	}

	public void anadirZapato(Zapato zapato) {
		productosDisponibles.add(zapato);
		System.out.println("Zapato añadido a la venta");
	}
	
	public boolean sacarZapato(Zapato zapato) throws Exception {
	    //Forma 1
        /* for(Zapato elemento: productosDisponibles) {
             if(elemento == zapato) {
                 System.out.println("Vendiendo zapato Modelo " + elemento.getModelo());
                 return productosDisponibles.remove(elemento);
             }
         }
         System.out.println("Zapato no disponible");
         return false;*/
         		
		//Forma 2
		/*if(productosDisponibles.contains(zapato)) {
	        System.out.println("Vendiendo zapato Modelo " + zapato.getModelo());
	        return productosDisponibles.remove(zapato);
	    }
	    System.out.println("Zapato no disponible");
        return false;*/
        
        //Forma 3
        if(productosDisponibles.contains(zapato)) {
            System.out.println("Vendiendo zapato Modelo " + zapato.getModelo());
            return productosDisponibles.remove(zapato);
        } else {
            System.out.println("Zapato no disponible");
            throw new Exception();
        }
	}
		
}
