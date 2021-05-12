
public class Main {

    public static void main(String[] args) {
        CocheManual cocheManual = new CocheManual();
        cocheManual.moverse();
        
        System.out.println("---------------------------------------");
        
        CocheAutomatico cocheAutomatico = new CocheAutomatico();
        cocheAutomatico.moverse();

    }

}
