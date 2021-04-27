
public class MainEmpleo {

    public static void main(String[] args) {
        CrearEmpleoFactory empleo = new CrearEmpleoFactory();
        
        long initialTime = System.currentTimeMillis();
        
        Cliente clienteCajera = new ClienteTienda("ClienteCajera", new int[] { 1, 1, 1, 5, 2, 3 });
        Empleo cajera = empleo.realizarTrabajo(TipoEmpleo.CAJERA, "Cajera1", clienteCajera, initialTime);
        cajera.run();
        
        Cliente clienteGestor = new ClienteGestoria();
        Empleo gestor = empleo.realizarTrabajo(TipoEmpleo.GESTOR, "Gestor1", clienteGestor, initialTime);
        gestor.run();

    }

}
