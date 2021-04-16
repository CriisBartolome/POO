
public class Calculadora {

    public float division(float valor1, float valor2) throws MiExcepcion{
        if(valor2 == 0) {
            throw new MiExcepcion(1);
        }
        return valor1 / valor2;
    }
}
