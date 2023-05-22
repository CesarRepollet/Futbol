import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;
    private String nombre_estadio;
    private int puntos;
    private String nombre_aficion;
    private List<Jugador> jugadores;
    private List<Estadio> estadios;


    public Equipo(String nombre, String nombre_estadio, int puntos, String nombre_aficion) {
        this.nombre = nombre;
        this.nombre_estadio = nombre_estadio;
        this.puntos = puntos;
        this.nombre_aficion = nombre_aficion;
        this.jugadores = new ArrayList<>();
        this.estadios = new Arraylist<>();
    }

    public Equipo() {
        this.jugadores = new ArrayList<>();
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public String getNombre_estadio() {
        return nombre_estadio;
    }

    public void setNombre_estadio(String nombre_estadio) {
        this.nombre_estadio = nombre_estadio;
    }

    public String getNombre_aficion() {
        return nombre_aficion;
    }

    public void setNombre_aficion(String nombre_aficion) {
        this.nombre_aficion = nombre_aficion;
    }

    public List<Estadio> getEstadios() {
        return estadios;
    }

    public void setEstadios(List<Estadio> estadios) {
        this.estadios = estadios;
    }

    public void agregarjugador(String nombre, String apellidos, int idjugador, int edad, int numero){
        Jugador jugador_Nuevo = new Jugador(nombre, apellidos, idjugador, edad, numero);
        jugadores.add(jugador_Nuevo);
    }
    public void eliminarjugador(int idjugador){
        for (int i = 0; i < jugadores.size(); i++) {
            if (idjugador.equals(jugadores.get(i).getidjugador())){
                jugadores.remove(i);
            }
        }
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Equipo{" +
                "nombre='" + nombre + '\'' +
                ", nombre_estadio='" + nombre_estadio + '\'' +
                ", puntos=" + puntos +
                ", nombre_aficion='" + nombre_aficion + '\'' +
                ", jugadores=" + jugadores +
                '}';
    }
}
