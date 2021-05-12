
public abstract class CocheTemplateMethod {

    public void moverse(){
        acelerar();
        cambiarMarcha();
        frenar();
    }
 
    private void acelerar(){
        System.out.println("Acelerando...");
    }
 
    private void frenar(){
        System.out.println("Frenando...");
    }
 
    protected abstract void cambiarMarcha();
}
