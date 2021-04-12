
public class Main {

    //LLamada a main() -> se a�ade a Stack
    public static void main(String[] args) {
        // Creo un objeto Camiseta
        //La referencia que lo apunta se guarda en Stack
        //El propio objeto se crea dentro del Heap
        //Almaceno el valor que paso en Stack
        //Dentro del objeto del Heap tengo la variable talla = 38 y color = null
        Camiseta camiseta = new Camiseta(38);
        //Se desapila el valor y la llamada al constructor
        
        //LLamada a setColor() -> se a�ade a Stack
        //Almaceno el valor que paso en Stack
        //Se motifica el color dentro del Heap
        camiseta.setColor("Rojo");
        //Se desapila el valor y la llamada al m�todo
        
        //LLamada a getTalla() -> se a�ade a Stack
        camiseta.getTalla();
        //Se desapila la llamada al m�todo

    }

}
