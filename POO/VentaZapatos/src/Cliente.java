import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

@Getter
public class Cliente {

	private String nombre;
	private String apellido;
	private List<Zapato> compras;
	
	public Cliente(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.compras = new ArrayList<>();
	}	
	
	public boolean Comprar(Zapato zapato, TiendaZapatos tienda) throws Exception {
		if(tienda.sacarZapato(zapato) == true) {
			compras.add(zapato);
			return true;
		}
		return false;
	}
}
