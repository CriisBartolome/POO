import lombok.NoArgsConstructor;

@NoArgsConstructor
public class BuilderCocheFull extends BuilderCoche{
    
    @Override
     public void construirMotor() {
        this.getCoche().setMotor("Motor de potencia alta");
    }
    
    @Override
     public void construirCarroceria() {
        this.getCoche().setCarroceria("Carrocería de alta protección");
    }
    
    @Override
     public void construirAireAcond() {
        this.getCoche().setAireAcond(true);
    }
    
    @Override
     public void construirElevalunas() {
        this.getCoche().setElevalunasElec(true);
    }
}
