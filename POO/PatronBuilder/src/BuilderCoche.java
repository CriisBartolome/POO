import lombok.Getter;

public abstract class BuilderCoche {

    @Getter
    private Coche coche;

    public void crearNuevoCoche() {
        this.coche = new Coche();
    }

    // M�todos que deber�n ser constru�dos por las clases que hereden de �sta
    public abstract void construirMotor();

    public abstract void construirCarroceria();

    public abstract void construirAireAcond();

    public abstract void construirElevalunas();
}
