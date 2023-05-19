import jdk.jshell.spi.SPIResolutionException;

import java.util.ArrayList;
import java.util.List;

public class Liga {
    private String nombre;
    private String pais;
    private int presupuesto;
    private List<Equipo> equipos;
    private List<Arbitro> arbitros;
    private List<Jornada> jornadas;

    public Liga(String nombre, List<Equipo> equipos) {
        this.nombre = nombre;
        this.equipos = equipos;
    }

    public Liga(String nombre) {
        this.nombre = nombre;
        this.equipos = new ArrayList<>();
    }

    public Liga() {
        this.pais = pais;
        this.presupuesto = presupuesto;
        this.equipos = new ArrayList<>();
        this.arbitros = new ArrayList<>();
        this.jornadas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(List<Equipo> equipos) {
        this.equipos = equipos;
    }

    public List<Arbitro> getArbitros() {
        return arbitros;
    }

    public void setArbitros(List<Arbitro> arbitros) {
        this.arbitros = arbitros;
    }

    public List<Jornada> getJornadas() {
        return jornadas;
    }

    public void setJornadas(List<Jornada> jornadas) {
        this.jornadas = jornadas;
    }

    @Override
    public String toString() {
        return "Liga{" +
                "nombre='" + nombre + '\'' +
                ", equipos=" + equipos + '\'' +
                ", Arbitro=" + arbitros + '\'' +
                ", Jornada=" + jornadas + '\'' +
                '}' + '\n';
    }
}