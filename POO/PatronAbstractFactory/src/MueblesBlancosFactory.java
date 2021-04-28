//ConcreteFactory
public class MueblesBlancosFactory extends MueblesAbstractFactory{

    @Override
    public Silla fabricarSilla() {
        Silla sillaBlanca = new SillaBlanca();
        return sillaBlanca;
    }

    @Override
    public Mesa fabricarMesa() {
        Mesa mesaBlanca = new MesaBlanca();
        return mesaBlanca;
    }

}
