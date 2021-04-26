import java.util.concurrent.ThreadLocalRandom;

public class MainCarrera {

    private static int longitud = 8;
    
    public static void main(String[] args) {
        
        Corredor corredor1 = new Corredor("Pepe", 1/1, longitud);
        Corredor corredor2 = new Corredor("Maria", 1/0.5, longitud);
        
        double random = ThreadLocalRandom.current().nextDouble(0.3, 0.6);        
        Corredor corredor3 = new Corredor("Juan", 1/random, longitud);
        
        Corredor ganador = null;
                
        System.out.println("Comienza la carrera");
        System.out.println("-------------------------------------------------------------------------");
        
        corredor1.start();
        corredor2.start();
        corredor3.start();
        
        while (corredor1.isAlive()|| corredor2.isAlive() || corredor3.isAlive()) {
            
        }
        
        if(corredor1.getTiempo() <= corredor2.getTiempo()) {
            if(corredor1.getTiempo() <= corredor3.getTiempo()) {
                ganador = corredor1;
            }
            else {
                ganador = corredor3;
            }
        }
        else {
            if(corredor2.getTiempo() <= corredor3.getTiempo()) {
                ganador = corredor2;
            }
            else {
                ganador = corredor3;
            }
        }
                
        System.out.println("El ganador de la carrera ha sido " + ganador.getNombre() + " con un tiempo de " + ganador.getTiempo() + " segundos");
        System.out.println("Carrera finalizada");
        System.out.println("-------------------------------------------------------------------------");
        
    }
}
