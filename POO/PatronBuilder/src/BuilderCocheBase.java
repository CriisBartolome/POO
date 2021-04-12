import lombok.NoArgsConstructor;

@NoArgsConstructor
public class BuilderCocheBase extends BuilderCoche{
    
    @Override
     public void construirMotor() {
        this.getCoche().setMotor("Motor de potencia mínima");
    }
    
    @Override
     public void construirCarroceria() {
        this.getCoche().setCarroceria("Carrocería de baja protección");
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
