public class Fifa {
    private String presidente;
    private int n_ligas;

    private List<Equipo> equipos;
    private List<Arbitro> arbitros;
    private List<Jugador> jugadores;
    private Listz<Liga> ligas;
    public Fifa() {
    }

    public Fifa(String presidente, int n_ligas) {
        this.presidente = presidente;
        this.n_ligas = n_ligas;
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
    public void agregarliga(String nombre, int n_ligas){
        Liga liga_nueva = new Liga(nombre, n_ligas);
        ligas.add(liga_nueva);
    }
    public void eliminarliga(String nombre){
        for (int i = 0; i < ligas.size(); i++) {
            if (nombre.equals(ligas.get(i).getNombre())){
                ligas.remove(i);
            }
        }
    }
}