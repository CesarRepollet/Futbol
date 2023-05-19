import java.util.List;

public class Arbitro {
    private String nombre;
    private int sueldo;
    private String nacionalidad;
    private int n_arbitro;
    private int amonestaciones;
    private int expulsiones;

    public Arbitro() {
    }

    public Arbitro(String nombre, int sueldo, String nacionalidad, int n_arbitro, int amonestaciones, int expulsiones) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.nacionalidad = nacionalidad;
        this.n_arbitro = n_arbitro;
        this.amonestaciones = amonestaciones;
        this.expulsiones = expulsiones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getN_arbitro() {
        return n_arbitro;
    }

    public void setN_arbitro(int n_arbitro) {
        this.n_arbitro = n_arbitro;
    }

    public int getAmonestaciones() {
        return amonestaciones;
    }

    public void setAmonestaciones(int amonestaciones) {
        this.amonestaciones = amonestaciones;
    }

    public int getExpulsiones() {
        return expulsiones;
    }

    public void setExpulsiones(int expulsiones) {
        this.expulsiones = expulsiones;
    }

    @Override
    public String toString() {
        return "Arbitro{" +
                "nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", n_arbitro=" + n_arbitro +
                ", amonestaciones=" + amonestaciones +
                ", expulsiones=" + expulsiones +
                '}' + '\n';
    }
}
