
public class Calculo {

    private int total;
    
    public int realizarCalculo(int numeroFinal) {
        total = 0;
        for(int i = 1; i <= numeroFinal; i++) {
            if(i % 2 != 0) {
                total = total + i;
            }
            else {
                total =  (total + i) * i;
            }
        }
        return total;
    }
    
    public int realizarCalculoRecursividad(int numeroFinal) {
        total = 0;
        int iterador = numeroFinal;
        if(iterador == 1) {
            return total = 1;
        }
        else if (iterador > 1){
            if(iterador % 2 != 0) {
                total =  iterador + realizarCalculo(numeroFinal - 1);
            }
            else {
                total = (iterador + realizarCalculo(numeroFinal - 1)) * iterador;
            }     
        } 
        return total;
    }
    
}
