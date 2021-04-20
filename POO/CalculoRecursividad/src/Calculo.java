
public class Calculo {

    private int total;

    public int realizarCalculo(int numeroFinal) {
        total = 0;
        for (int i = 1; i <= numeroFinal; i++) {
            if (i % 2 != 0) {
                total = total + i;
            } else {
                total = (total + i) * i;
            }
        }
        return total;
    }

    public int realizarCalculoRecursividad(int numeroFinal) {
        if (condicionParada(numeroFinal)) {
            return 1;
        }
        int total = numeroFinal + realizarCalculoRecursividad(numeroFinal - 1);
        if (esPar(numeroFinal)) {
            total *= numeroFinal;
        }

        return total;
    }

    private boolean condicionParada(int numero) {
        return numero == 1;
    }

    private boolean esPar(int numero) {
        return numero % 2 == 0;
    }

}
