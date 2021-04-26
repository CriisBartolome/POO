
public class Corredor extends Thread{

    private String nombre;
    private double velocidad;
    private Pista pista;
    private double tiempo;
    
    public Corredor(String nombre, double velocidad, int longitud) {
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.pista = new Pista(longitud);
        this.tiempo = 0;
    }
    
    public void run() {
        
        System.out.println("El corredor " + nombre + " comienza la carrera ");

        double espacioRecorrido = 0;
        while(espacioRecorrido < pista.getLongitud()) {
            espacioRecorrido = espacioRecorrido + velocidad;
            tiempo++;
            System.out.println("El corredor " + nombre + " ha dado "+ espacioRecorrido + " pasos. Le quedan " + ((pista.getLongitud() - espacioRecorrido) <= 0 ? 0 : (pista.getLongitud() - espacioRecorrido)));
        }

        System.out.println("El corredor " + nombre + " ha terminado la carrera con un tiempo de: " + tiempo + " segundos");        
        System.out.println("-------------------------------------------------------------------------");
    }

    public String getNombre() {
        return nombre;
    }
    
    public double getTiempo() {
        return tiempo;
    }

}
