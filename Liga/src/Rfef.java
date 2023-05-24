import java.util.ArrayList;
import java.util.List;

public class Rfef {
    private String presidente;
    private String competiciones;
    private String clubes_campeones;
    private int margen_salarial;
    private List<Liga> ligas;
    private List<Equipo> equipos;
    private List<Arbitro> arbitros;
    private List<Jugador> jugadores;
    private List<Jornada> jornadas;
    private List<Jornada_copa> ronda;
    private List<Estadio> estadios;

    public Rfef() {
    }

    public Rfef(String presidente, String competiciones, String clubes_campeones, int margen_salarial) {
        this.presidente = presidente;
        this.competiciones = competiciones;
        this.clubes_campeones = clubes_campeones;
        this.margen_salarial = margen_salarial;
        this.ligas = new ArrayList<>();
    }

    public String getPresidente() {
        return presidente;
    }

    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }

    public String getCompeticiones() {
        return competiciones;
    }

    public void setCompeticiones(String competiciones) {
        this.competiciones = competiciones;
    }

    public String getClubes_campeones() {
        return clubes_campeones;
    }

    public void setClubes_campeones(String clubes_campeones) {
        this.clubes_campeones = clubes_campeones;
    }

    public int getMargen_salarial() {
        return margen_salarial;
    }

    public void setMargen_salarial(int margen_salarial) {
        this.margen_salarial = margen_salarial;
    }

    public List<Liga> getLigas() {
        return ligas;
    }

    public void setLigas(List<Liga> ligas) {
        this.ligas = ligas;
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

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public List<Jornada> getJornadas() {
        return jornadas;
    }

    public void setJornadas(List<Jornada> jornadas) {
        this.jornadas = jornadas;
    }

    public List<Estadio> getEstadios() {
        return estadios;
    }

    public void setEstadios(List<Estadio> estadios) {
        this.estadios = estadios;
    }

    public List<Jornada_copa> getRonda() {
        return ronda;
    }

    public void setRonda(List<Jornada_copa> ronda) {
        this.ronda = ronda;
    }

    public void agregarliga(String nombre, String pais, int presupuesto) {
        Liga liga_nueva = new Liga(nombre, pais, presupuesto);
        ligas.add(liga_nueva);
    }

    public void eliminarliga(String nombre) {
        for (int i = 0; i < ligas.size(); i++) {
            if (nombre.equals(ligas.get(i).getNombre())) {
                ligas.remove(i);
            }
        }
    }
    public void agregarcampeon(String nombre, String nombre_estadio, int puntos, String nombre_aficion) {
        Equipo campeon_nuevo = new Equipo(nombre, nombre_estadio, puntos, nombre_aficion);
        equipos.add(campeon_nuevo);
    }

    public void eliminarcampeon(String nombre) {
        for (int i = 0; i < equipos.size(); i++) {
            if (nombre.equals(equipos.get(i).getNombre())) {
                equipos.remove(i);
            }
        }
    }


    @java.lang.Override
    public java.lang.String toString() {
        return "Rfef{" +
                "presidente='" + presidente + '\'' +
                ", competiciones='" + competiciones + '\'' +
                ", clubes_campeones='" + clubes_campeones + '\'' +
                ", margen_salarial=" + margen_salarial +
                ", equipos=" + equipos +
                ", arbitros=" + arbitros +
                ", jugadores=" + jugadores +
                ", jornadas=" + jornadas +
                ", ronda=" + ronda +
                '}';
    }
}
