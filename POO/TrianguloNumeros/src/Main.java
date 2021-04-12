
public class Main {

    public static void main(String[] args) {
        Triangulo20 triangulo = new Triangulo20();
        int[] solucion = triangulo.obtenerTriangulo20();
        int contador = 1;
        for(int posicion = 0; posicion<solucion.length; posicion++) {    
            if(contador % 4 == 0) {
                System.out.println(solucion[posicion]);
            }
            else {
                System.out.print(solucion[posicion]+ " ");
            }
            contador++;
        }

    }

}
