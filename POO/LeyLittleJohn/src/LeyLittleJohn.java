
public class LeyLittleJohn {

    //N Usuarios del sistema
    //V Rendimiento
    //T Tiempo de entrega
    //Fórmula: N = V x T
    
    public double calcularUsuarios(double rendimiento, double tiempoEntrega) {
        return rendimiento * tiempoEntrega;
    }
    
    public double calcularRendimiento(double usuarios, double tiempoEntrega) {
        return usuarios / tiempoEntrega;
    }
    
    public double calcularTiempoEntrega(double usuarios, double rendimiento) {
        return usuarios / rendimiento;
    }
}
