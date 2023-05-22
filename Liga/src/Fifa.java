import java.util.ArrayList;
import java.util.List;

public class Fifa {
    private String presidente;
    private int n_ligas;

    private List<Equipo> equipos;
    private List<Arbitro> arbitros;
    private List<Jugador> jugadores;
    private List<Liga> ligas;
    public Fifa() {
    }

    public Fifa(String presidente, int n_ligas) {
        this.presidente = presidente;
        this.n_ligas = n_ligas;
        this.ligas = new ArrayList<>();
        this.arbitros = new ArrayList<>();
        this.equipos = new ArrayList<>();
        this.jugadores = new ArrayList<>();

    }

    public String getPresidente() {
        return presidente;
    }

    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }

    public int getN_ligas() {
        return n_ligas;
    }

    public void setN_ligas(int n_ligas) {
        this.n_ligas = n_ligas;
    }

    public void agregarliga(String nombre, String pais, int presupuesto){
        Liga liga_nueva = new Liga(nombre, pais, presupuesto);
        ligas.add(liga_nueva);
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

    public List<Liga> getLigas() {
        return ligas;
    }

    public void setLigas(List<Liga> ligas) {
        this.ligas = ligas;
    }

    public void eliminarliga(String nombre){
        for (int i = 0; i < ligas.size(); i++) {
            if (nombre.equals(ligas.get(i).getNombre())){
                ligas.remove(i);
            }
        }
    }
}