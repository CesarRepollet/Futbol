import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;
    private String nombre_estadio;
    private int puntos;
    private String nombre_aficion;
    private List<Jugador> jugadores;


    public Equipo(String nombre, String nombre_estadio, int puntos, String nombre_aficion) {
        this.nombre = nombre;
        this.nombre_estadio = nombre_estadio;
        this.puntos = puntos;
        this.nombre_aficion = nombre_aficion;
        this.jugadores = new ArrayList<>();
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

    @Override
    public String toString() {
        return "Equipo{" +
                "nombre='" + nombre + '\'' +
                ", puntos=" + puntos +
                ", jugadores=" + jugadores +
                '}' + '\n';
    }
}
