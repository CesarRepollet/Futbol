public class Jugador {
    private String nombre;
    private int edad;
    private int numero;

    private int goles;

    private int asistencias;

    private int tarjetas_amarillas;

    private int tarjetas_rojas;

    public Jugador(String nombre, int edad, int numero, int goles, int asistencias, int tarjetas_amarillas, int tarjetas_rojas) {
        this.nombre = nombre;
        this.edad = edad;
        this.numero = numero;
        this.goles = goles;
        this.asistencias = asistencias;
        this.tarjetas_amarillas = tarjetas_amarillas;
        this.tarjetas_rojas = tarjetas_rojas;
    }

    public Jugador() {
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public int getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }

    public int getTarjetas_amarillas() {
        return tarjetas_amarillas;
    }

    public void setTarjetas_amarillas(int tarjetas_amarillas) {
        this.tarjetas_amarillas = tarjetas_amarillas;
    }

    public int getTarjetas_rojas() {
        return tarjetas_rojas;
    }

    public void setTarjetas_rojas(int tarjetas_rojas) {
        this.tarjetas_rojas = tarjetas_rojas;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", numero=" + numero +
                ", goles=" + goles +
                ", asistencias=" + asistencias +
                ", tarjetas_amarillas=" + tarjetas_amarillas +
                ", tarjetas_rojas=" + tarjetas_rojas +
                '}';
    }
}
