import lombok.Getter;

public abstract class BuilderCoche {

    @Getter
    private Coche coche;

    public void crearNuevoCoche() {
        this.coche = new Coche();
    }

    // Métodos que deberán ser construídos por las clases que hereden de ésta
    public abstract void construirMotor();

    public abstract void construirCarroceria();

    public abstract void construirAireAcond();

    public abstract void construirElevalunas();
}
