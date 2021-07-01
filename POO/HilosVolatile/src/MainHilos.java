
public class MainHilos {

    public static void main(String[] args){

        // En este código se puede ver que el valor actual siempre se actualiza
        // bien, no hay números repetidos

        VolatileContador vContador = new VolatileContador();
        Thread hilo1 = new VolatileThread(vContador);
        Thread hilo2 = new VolatileThread(vContador);
        Thread hilo3 = new VolatileThread(vContador);
        Thread hilo4 = new VolatileThread(vContador);

        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();

        while (hilo1.isAlive() && hilo2.isAlive() && hilo3.isAlive() && hilo4.isAlive()) {

        }

    }

}
