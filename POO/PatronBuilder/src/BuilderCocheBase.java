import lombok.NoArgsConstructor;

@NoArgsConstructor
public class BuilderCocheBase extends BuilderCoche{
    
    @Override
     public void construirMotor() {
        this.getCoche().setMotor("Motor de potencia m�nima");
    }
    
    @Override
     public void construirCarroceria() {
        this.getCoche().setCarroceria("Carrocer�a de baja protecci�n");
    }
    
    @Override
     public void construirAireAcond() {
        this.getCoche().setAireAcond(false);
    }
    
    @Override
     public void construirElevalunas() {
        this.getCoche().setElevalunasElec(false);
    }
}
