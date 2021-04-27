
public class MainCalculo {

    public static void main(String[] args) {
        //Ejemplo supermercado
        LeyLittleJohn ley = new LeyLittleJohn();
        
        //Cuántos clientes se procesan en un cierto tiempo?
        double rendimiento = 40; // 40 clientes / hora
        double tiempo = 0.5; // media hora
        System.out.println("Se procesan " + ley.calcularUsuarios(rendimiento, tiempo) + " clientes si disponemos de " + tiempo + " horas y el rendimiento es de " + rendimiento + " usuarios a la hora");
        System.out.println("            ----");
        
        //Cuál es el rendimiento de las cajeras?
        double usuarios = 50; // 50 clientes
        tiempo = 1.5; // hora y media
        System.out.println("Se procesan " + usuarios + " clientes si disponemos de " + tiempo + " horas y el rendimiento es de " + ley.calcularRendimiento(usuarios, tiempo) + " usuarios a la hora");
        System.out.println("                                                                            ------------------");
        
        //Cuál es el tiempo de espera de un cliente?
        usuarios = 60; // 60 clientes
        rendimiento = 35; // 35 clientes / hora
        System.out.println("Se procesan " + usuarios + " clientes si disponemos de " + ley.calcularTiempoEntrega(usuarios, rendimiento) + " horas y el rendimiento es de " + rendimiento + " usuarios a la hora");
        System.out.println("                                           ------------------");

    }

}
