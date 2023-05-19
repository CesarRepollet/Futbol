import java.util.ArrayList;
import java.util.List;

public class Jornada {
    private int n_jornada;
    private int resultado;
    private String incidencias;
    private String revisiones;

    private List<Equipo> equipos;
    private List<Arbitro> arbitros;

    public Jornada() {
    }

    public Jornada(int n_jornada, int resultado, String incidencias, String revisiones) {
        this.n_jornada = n_jornada;
        this.resultado = resultado;
        this.incidencias = incidencias;
        this.revisiones = revisiones;
        this.equipos = new ArrayList<>();
        this.arbitros = new ArrayList<>();
    }
    public int getN_jornada() {
        return n_jornada;
    }

    public void setN_jornada(int n_jornada) {
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

    @Override
    public String toString() {
        return "Jornada{" +
                "n_jornada=" + n_jornada +
                ", resultado=" + resultado +
                ", incidencias='" + incidencias + '\'' +
                ", revisiones='" + revisiones + '\'' +
                ", equipos=" + equipos +
                '}' + '\n';
    }
}
