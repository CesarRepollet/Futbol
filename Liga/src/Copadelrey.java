import java.util.List;

public class Copadelrey {

    private String club_campeon;
    private String equipos_participantes;
    private String equipos_eliminados;
    private List<Equipo> equipos;
    private List<Arbitro> arbitros;
    private List<Jornada_copa> jornadas_copa;

    public Copadelrey() {
    }

    public Copadelrey(String club_campeon, String equipos_participantes, String equipos_eliminados) {
        this.club_campeon = club_campeon;
        this.equipos_participantes = equipos_participantes;
        this.equipos_eliminados = equipos_eliminados;
    }

    public String getClub_campeon() {
        return club_campeon;
    }

    public void setClub_campeon(String club_campeon) {
        this.club_campeon = club_campeon;
    }

    public String getEquipos_participantes() {
        return equipos_participantes;
    }

    public void setEquipos_participantes(String equipos_participantes) {
        this.equipos_participantes = equipos_participantes;
    }

    public String getEquipos_eliminados() {
        return equipos_eliminados;
    }

    public void setEquipos_eliminados(String equipos_eliminados) {
        this.equipos_eliminados = equipos_eliminados;
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

    public List<Jornada_copa> getJornadas_copa() {
        return jornadas_copa;
    }

    public void setJornadas_copa(List<Jornada_copa> jornadas_copa) {
        this.jornadas_copa = jornadas_copa;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Copadelrey{" +
                "club_campeon='" + club_campeon + '\'' +
                ", equipos_participantes=" + equipos_participantes +
                ", equipos=" + equipos +
                ", arbitros=" + arbitros +
                ", jornadas_copa=" + jornadas_copa +
                '}';
    }
}
