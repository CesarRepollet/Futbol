import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;
    private int puntos;
    private List<Jugador> jugadores;


    public Equipo(int puntos, String nombre) {
        this.nombre = nombre;
        this.puntos = puntos;
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
                '}';
    }
}
