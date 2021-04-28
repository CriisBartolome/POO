//ConcreteFactory
public class MueblesMarronesFactory extends MueblesAbstractFactory{

    @Override
    public Silla fabricarSilla() {
        Silla sillaMarron = new SillaMarron();
        return sillaMarron;
    }

    @Override
    public Mesa fabricarMesa() {
        Mesa mesaMarron = new MesaMarron();
        return mesaMarron;
    }
}
