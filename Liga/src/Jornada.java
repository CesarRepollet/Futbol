import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Jornada {
    private String n_jornada;
    private String equipos_participantes;
    private int dias_mes;
    private int resultado;
    private String incidencias;
    private String revisiones;

    private List<Equipo> equipos;
    private List<Arbitro> arbitros;
    private List<Estadio> estadios;

    public Jornada() {
    }

    public Jornada(String n_jornada, String equipos_participantes, int dias_mes, int resultado, String incidencias, String revisiones) {
        this.n_jornada = n_jornada;
        this.equipos_participantes = equipos_participantes;
        this.dias_mes = dias_mes;
        this.resultado = resultado;
        this.incidencias = incidencias;
        this.revisiones = revisiones;
        this.equipos = new ArrayList<>();
        this.arbitros = new ArrayList<>();
        this.estadios = new ArrayList<>();
    }

    public String getN_jornada() {
        return n_jornada;
    }

    public void setN_jornada(String n_jornada) {
        this.n_jornada = n_jornada;
    }
    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public String getIncidencias() {
        return incidencias;
    }

    public void setIncidencias(String incidencias) {
        this.incidencias = incidencias;
    }

    public String getRevisiones() {
        return revisiones;
    }

    public void setRevisiones(String revisiones) {
        this.revisiones = revisiones;
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

    public String getEquipos_participantes() {
        return equipos_participantes;
    }

    public void setEquipos_participantes(String equipos_participantes) {
        this.equipos_participantes = equipos_participantes;
    }

    public int getDias_mes() {
        return dias_mes;
    }

    public void setDias_mes(int dias_mes) {
        this.dias_mes = dias_mes;
    }

    public List<Estadio> getEstadios() {
        return estadios;
    }

    public void setEstadios(List<Estadio> estadios) {
        this.estadios = estadios;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Jornada{" +
                "n_jornada='" + n_jornada + '\'' +
                ", equipos_participantes='" + equipos_participantes + '\'' +
                ", dias_mes=" + dias_mes +
                ", resultado=" + resultado +
                ", incidencias='" + incidencias + '\'' +
                ", revisiones='" + revisiones + '\'' +
                ", equipos=" + equipos +
                ", arbitros=" + arbitros +
                ", estadios=" + estadios +
                '}';
    }
}