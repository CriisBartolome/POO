
public interface Interface {
    
    //Si tengo un m�todo que solo quiero definir en algunas de las clases que implementan la
    //interfaz, puedo definirlo como default e implementarlo

    public default String count() {
        System.out.println("Hola Mundo");
        return "Hola Mundo";
    }
}
