
public class Clase2 {

    private Clase3 clase3;

    public Clase2(Clase3 clase3) {
        super();
        this.clase3 = clase3;
        this.clase3.setEdad(19);
        this.clase3.setNombre("Maria");
    }

    public Clase3 getClase3() {
        return clase3;
    }

    public void setClase3(Clase3 clase3) {
        this.clase3 = clase3;
    }

}
