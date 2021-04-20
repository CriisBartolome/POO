import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
public class Linea {

    private List<Integer> numeros;
    
    public Linea() {
        numeros = new ArrayList<>();
    }
    
    public boolean obtenerValores(int posicionABuscar, Linea linea, int valorInicial) {
        for(int valor = valorInicial; valor <= 9; valor++) {
            if((!numeros.contains(valor)) && (! linea.getNumeros().contains(valor))) {
                numeros.add(posicionABuscar, valor);
                if(numeros.size() == 4) {
                    if (sumarNumeros() == 20) {
                        return true;
                    }
                    else {
                        numeros.remove(posicionABuscar);
                        continue;
                        //return false;
                    }
                }
                if(!obtenerValores(posicionABuscar + 1, linea, 1)) {
                    numeros.remove(posicionABuscar);
                    continue;
                    //obtenerValores(posicionABuscar);
                }
                else {
                    return true;
                }
                                
            }
        
        }
        return false;
    }

    private int sumarNumeros() {
    
        int suma = 0;
        for(Integer iterador: numeros) {
            suma = suma + iterador;
        }
        return suma;
    }
    
    public void siguienteLinea(Linea linea1, Linea linea2) {
        int contador = 0;
        //for(;(contador < linea1.getNumeros().size()) && (numeros.size() != 4); contador++) {
         
        while ((contador < linea1.getNumeros().size()) && (numeros.size() != 4)) {
            //if(numeros.size() != 0)
            if(!numeros.isEmpty()) {
                numeros.remove(0);
            }
            if(!linea2.getNumeros().isEmpty()) {
                if(!linea2.getNumeros().contains(linea1.getNumeros().get(contador))){
                    while(comparar(linea2) != 1) {
                        if(!numeros.isEmpty()) {
                            numeros.clear();
                        }
                        numeros.add(linea1.getNumeros().get(contador));
                        obtenerValores(1, linea1, 1);
                        contador++;
                    }
                }
            }
            else {
                numeros.add(linea1.getNumeros().get(contador));
                obtenerValores(1, linea1, 1);
            }
            contador++;
        }
    }
    
    public int comparar(Linea linea) {
        int contador = 0;
        for(Integer valor: this.numeros) {
            if(linea.getNumeros().contains(valor)) {
                contador++;
            }
        }
        return contador;
    }
}
