import lombok.NoArgsConstructor;

@NoArgsConstructor
public class BuilderCocheMedio extends BuilderCoche{
    
    @Override
     public void construirMotor() {
        this.getCoche().setMotor("Motor de potencia media");
    }
    
    @Override
     public void construirCarroceria() {
        this.getCoche().setCarroceria("Carrocer�a de protecci�n media");
    }
    
    @Override
     public void construirAireAcond() {
        this.getCoche().setAireAcond(false);
    }
    
    @Override
     public void construirElevalunas() {
        this.getCoche().setElevalunasElec(true);
    }

}
