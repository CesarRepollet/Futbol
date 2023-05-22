public class Rfef {
    private String presidente;
    private String competiciones;
    private String clubes_campeones;
    private int margen_salarial;

    private List<Equipo> equipos;
    private List<Arbitro> arbitros;
    private List<Jugador> jugadores;
    private List<Jornada> jornadas;
    private List<Jornada_copa> ronda;
    public Rfef() {
    }

    public Rfef(String presidente, String competiciones, String clubes_campeones, int margen_salarial) {
        this.presidente = presidente;
        this.competiciones = competiciones;
        this.clubes_campeones = clubes_campeones;
        this.margen_salarial = margen_salarial;
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

    public List<Jornada_copa> getRonda() {
        return ronda;
    }

    public void setRonda(List<Jornada_copa> ronda) {
        this.ronda = ronda;
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
