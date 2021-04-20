import java.util.HashSet;
import java.util.Set;

public class MainLinea {

    public static void main(String[] args) {
        Linea linea1 = new Linea();
        linea1.obtenerValores(0, new Linea(), 6);
        System.out.println(linea1.getNumeros());
        
        Linea linea2 = new Linea();
        linea2.siguienteLinea(linea1, new Linea());   
        System.out.println(linea2.getNumeros());
        //System.out.println(linea1.comparar(linea2));
        
        Linea linea3 = new Linea();
        linea3.siguienteLinea(linea2, linea1);
        System.out.println(linea3.getNumeros());
        
        /*Set<Integer> total = new HashSet<>();
        total.addAll(linea1.getNumeros());
        total.addAll(linea2.getNumeros());
        total.addAll(linea3.getNumeros());
        System.out.println();
        for(Integer dato: total) {
            System.out.print(dato + " ");
        }*/
    }
}
