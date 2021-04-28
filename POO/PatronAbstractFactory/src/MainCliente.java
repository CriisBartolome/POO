
public class MainCliente {

    public static void main(String[] args) {
        // Ejemplo de muebles blancos
        MueblesBlancosFactory mueblesBlancosFactory = new MueblesBlancosFactory();
        System.out.println("--- Muebles de color blanco ---");

        Silla sillaBlanca = mueblesBlancosFactory.fabricarSilla();
        System.out.println(sillaBlanca.obtenerColor());

        Mesa mesaBlanca = mueblesBlancosFactory.fabricarMesa();
        System.out.println(mesaBlanca.obtenerColor());
        
        System.out.println("-------------------------------");

        // Ejemplo de muebles marrones
        MueblesMarronesFactory mueblesMarronesFactory = new MueblesMarronesFactory();
        System.out.println("--- Muebles de color marrón ---");

        Silla sillaMarron = mueblesMarronesFactory.fabricarSilla();
        System.out.println(sillaMarron.obtenerColor());

        Mesa mesaMarron = mueblesMarronesFactory.fabricarMesa();
        System.out.println(mesaMarron.obtenerColor());

    }

}
