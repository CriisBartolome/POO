import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Director {
    
     public void construir(BuilderCoche builder){
        builder.crearNuevoCoche();
        builder.construirMotor();
        builder.construirCarroceria();
        builder.construirElevalunas();
        builder.construirAireAcond();
    }
     
}
