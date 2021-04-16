
public class MainCalculadora {

   public static void main(String[] args) {
       Calculadora calculadora = null;
       try {
        System.out.println(calculadora.division(4, 0));
       } catch (MiExcepcion e) {
        e.printStackTrace();
       }catch (NullPointerException e) {
           System.out.println("Excepcion de runtime");
       }
   }
}
