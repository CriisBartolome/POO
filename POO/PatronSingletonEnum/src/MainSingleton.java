
public class MainSingleton {

    public static void main(String[] args) {

        // Obtengo la instancia inicial
        EnumSingleton singleton1 = EnumSingleton.INSTANCIA.getInstancia();

        System.out.println(singleton1.getNombreConexion());

        // Obtengo la instancia inicial y modifico el nombre
        EnumSingleton singleton2 = EnumSingleton.INSTANCIA.getInstancia();
        singleton2.setNombreConexion("H2 database");

        // Muestro el nombre de la instancia para cada elemento enum que he
        // creado
        System.out.println(singleton1.getNombreConexion());
        System.out.println(singleton2.getNombreConexion());

        // Obtengo la instancia inicial y modifico el nombre
        EnumSingleton singleton3 = EnumSingleton.INSTANCIA.getInstancia();
        singleton2.setNombreConexion("SQL database");

        // Muestro el nombre de la instancia para cada elemento enum que he
        // creado (el nombre se ha modificado para todos, por lo que es claro
        // que solo tengo una instancia)
        System.out.println(singleton1.getNombreConexion());
        System.out.println(singleton2.getNombreConexion());
        System.out.println(singleton3.getNombreConexion());

    }

}
