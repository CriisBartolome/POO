
public class MainHilos {

    public static void main(String[] args) {

        // En este código se puede ver que el valor actual siempre se actualiza
        // bien, no hay números repetidos

        VariablesAtomicasContador vAContador = new VariablesAtomicasContador();
        Thread hilo1 = new VariablesAtomicasThread(vAContador);
        Thread hilo2 = new VariablesAtomicasThread(vAContador);
        Thread hilo3 = new VariablesAtomicasThread(vAContador);
        Thread hilo4 = new VariablesAtomicasThread(vAContador);

        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();

        while (hilo1.isAlive() && hilo2.isAlive() && hilo3.isAlive() && hilo4.isAlive()) {

        }

    }

}
