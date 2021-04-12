
public class PatronesCoche {
	
	public static void mostrarCaracteristicas( Coche coche ){
        System.out.println( "Motor: " + coche.getMotor() );
        System.out.println( "Carrocería: " + coche.getCarroceria() );
        System.out.println( "Elevalunas eléctrico: " + coche.getElevalunasElec() );
        System.out.println( "Aire acondicionado: " + coche.getAireAcond() );
        System.out.println("===================================");
    }

	public static void main(String[] args){
		
        // Crear el objeto Director
         Director objFabrica = new Director();
         
        // Crear los objetos ConcreteBuilder
         BuilderCoche base  = new BuilderCocheBase();
         BuilderCoche medio = new BuilderCocheMedio();
         BuilderCoche full  = new BuilderCocheFull();
         
        // Construir un coche con equipamiento base
         objFabrica.construir(base);
         Coche cocheBase = base.getCoche();
        // Construir un coche con equipamiento medio
        objFabrica.construir(medio);
        Coche cocheMedio = medio.getCoche();
        // Construir un coche con equipamiento full
        objFabrica.construir(full);
        Coche cocheFull = full.getCoche();
        
        // Mostrar la información de cada coche creado
        mostrarCaracteristicas(cocheBase);
        mostrarCaracteristicas(cocheMedio);
        mostrarCaracteristicas(cocheFull);
    }
    
}
