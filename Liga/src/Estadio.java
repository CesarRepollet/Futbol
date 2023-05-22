public class Estadio {
    private String nombre;
    private int capacidad;
    private String ciudad;
    private String equipo;

    public Estadio() {
    }

    public Estadio(String nombre, int capacidad, String ciudad, String equipo) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.ciudad = ciudad;
        this.equipo = equipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Estadio{" +
                "nombre='" + nombre + '\'' +
                ", capacidad=" + capacidad +
                ", ciudad='" + ciudad + '\'' +
                ", equipo='" + equipo + '\'' +
                '}';
    }
}
