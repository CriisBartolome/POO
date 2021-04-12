import java.util.HashSet;
import java.util.Set;

public class Triangulo20 {

    int triangulo [];
    static final int SUMA = 20;
    
    public Triangulo20() {
        triangulo = new int[12];
    }
    
    public int[] obtenerTriangulo20() {
        Set <Set<Integer>> combinaciones4Elementos = new HashSet<>();
        
        combinaciones4Elementos = obtenerCombinaciones(combinaciones4Elementos);
        triangulo = obtenerTuplas(combinaciones4Elementos);
                       
        return triangulo;
    }

    private Set<Set<Integer>> obtenerCombinaciones(Set<Set<Integer>> combinaciones4Elementos) {
        
        for(int posicion1 = 1; posicion1 <=9; posicion1++) {
            for(int posicion2 = 1; posicion2 <=9; posicion2++) {
                if(posicion1 != posicion2) {
                    for(int posicion3 = 1; posicion3 <=9; posicion3++) {
                        if((posicion1 != posicion2) && (posicion2 != posicion3) && (posicion1 != posicion3)){
                            for(int posicion4 = 1; posicion4 <=9; posicion4++) {
                                if((posicion1 != posicion2) && (posicion2 != posicion3) && (posicion1 != posicion3) && (posicion3 != posicion4) && (posicion1 != posicion4) && (posicion2 != posicion4)){
                                    if ((posicion1 + posicion2 + posicion3 + posicion4) == SUMA) {
                                        Set<Integer> listaAuxiliar = new HashSet<>();
                                        listaAuxiliar.add(posicion1);
                                        listaAuxiliar.add(posicion2);
                                        listaAuxiliar.add(posicion3);
                                        listaAuxiliar.add(posicion4);
                                        //System.out.println(listaAuxiliar);
                                        combinaciones4Elementos.add(listaAuxiliar);
                                        //System.out.println(combinaciones4Elementos.size()); 
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        /*System.out.println(combinaciones4Elementos.size());
        for(Set<Integer> set: combinaciones4Elementos) {
            System.out.println(set);
        }*/
        return combinaciones4Elementos;
    }
    
    private int[] obtenerTuplas(Set<Set<Integer>> combinaciones4Elementos) {
        
        for(Set<Integer> tupla1 : combinaciones4Elementos) {
            for(Set<Integer> tupla2 : combinaciones4Elementos) {
                if(!tupla1.equals(tupla2)) {
                    for(Set<Integer> tupla3 : combinaciones4Elementos) {
                        if((!tupla1.equals(tupla2)) && (!tupla1.equals(tupla3)) && (!tupla2.equals(tupla3))) {
                            Set<Integer> numeros = new HashSet<>();
                            numeros.addAll(tupla1);
                            numeros.addAll(tupla2);
                            numeros.addAll(tupla3);
                            if (numeros.size() == 9) {
                                /*System.out.println(tupla1);
                                System.out.println(tupla2);
                                System.out.println(tupla3);
                                System.out.println();*/
                                Set<Integer> interseccion1 = new HashSet<>(tupla1);
                                Set<Integer> interseccion2 = new HashSet<>(tupla2);
                                Set<Integer> interseccion3 = new HashSet<>(tupla3);
                                interseccion1.retainAll(tupla2);                                
                                interseccion2.retainAll(tupla3);
                                interseccion3.retainAll(tupla1);
                                /*System.out.println(interseccion1);
                                System.out.println(interseccion2);
                                System.out.println(interseccion3);
                                System.out.println();*/
                                if((interseccion1.size() == 1) && (interseccion2.size() == 1) && (interseccion3.size() == 1)){
                                    /*System.out.println(interseccion1);
                                    System.out.println(interseccion2);
                                    System.out.println(interseccion3);*/
                                    int marcadorPosicion = 1;
                                    for(Integer elemento: tupla1) {
                                        if(interseccion3.contains(elemento)) {
                                            triangulo[0] = elemento;
                                        }
                                        else if (interseccion1.contains(elemento)) {
                                            triangulo[3] = elemento;
                                        }
                                        else {
                                            triangulo[marcadorPosicion] = elemento;
                                            marcadorPosicion++;
                                        }
                                    }
                                    marcadorPosicion = 5;
                                    for(Integer elemento: tupla2) {
                                        if(interseccion1.contains(elemento)) {
                                            triangulo[4] = elemento;
                                        }
                                        else if (interseccion2.contains(elemento)) {
                                            triangulo[7] = elemento;
                                        }
                                        else {
                                            triangulo[marcadorPosicion] = elemento;
                                            marcadorPosicion++;
                                        }
                                    }
                                    marcadorPosicion = 9;
                                    for(Integer elemento: tupla3) {
                                        if(interseccion2.contains(elemento)) {
                                            triangulo[8] = elemento;
                                        }
                                        else if (interseccion3.contains(elemento)) {
                                            triangulo[11] = elemento;
                                        }
                                        else {
                                            triangulo[marcadorPosicion] = elemento;
                                            marcadorPosicion++;
                                        }
                                    }
                                    /*int contador = 1;
                                    for(int posicion = 0; posicion<triangulo.length; posicion++) {    
                                        if(contador % 4 == 0) {
                                            System.out.println(triangulo[posicion]);
                                        }
                                        else {
                                            System.out.print(triangulo[posicion]+ " ");
                                        }
                                        contador++;
                                    }
                                    System.out.println();*/
                                    return triangulo;                                    
                                }
                            }
                        }
                    }
                }             
            }
        }
        return triangulo;
    }
    
}
