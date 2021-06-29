import java.io.Serializable;

public class Persona implements Serializable {

    // Número de versión que hay que tener en cuenta para la
    // serialización/deserialización
    private static final long serialVersionUID = 1L;

    private String nombre;
    // Transient: palabra reservada que indica que un atributo no debe ser
    // seiralizado
    private transient String apellido;

    public Persona(String nombre, String apellido) {
        super();
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", apellido=" + apellido + "]";
    }

}
