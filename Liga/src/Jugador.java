public class Jugador {
    private String nombre;
    private String apellidos;
    private int idjugador;
    private int edad;
    private int numero;

    private int goles;

    private int asistencias;

    private int tarjetas_amarillas;

    private int tarjetas_rojas;

    public Jugador(String nombre, String apellidos, int idjugador, int edad, int numero, int goles, int asistencias, int tarjetas_amarillas, int tarjetas_rojas) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.idjugador = idjugador;
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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getidjugador() {
        return idjugador;
    }

    public void setidjugador(int idjugador) {
        this.idjugador = idjugador;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", idjugador=" + idjugador +
                ", edad=" + edad +
                ", numero=" + numero +
                ", goles=" + goles +
                ", asistencias=" + asistencias +
                ", tarjetas_amarillas=" + tarjetas_amarillas +
                ", tarjetas_rojas=" + tarjetas_rojas +
                '}';
    }
}
