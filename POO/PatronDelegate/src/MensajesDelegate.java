
public class MensajesDelegate {

    //Objeto asociado para la delegación
    MensajesAuxiliar aux;
    
    public MensajesDelegate() {
        aux = new MensajesAuxiliar();
    }
    
    public void escribirHola() {
        aux.escribirHola();
    }
    
    public void escribirMundo() {
        aux.escribirMundo();
    }
}
