import java.util.ArrayList;
import java.util.List;

public class Liga {
    private String nombre;
    private String pais;
    private int presupuesto;
    private List<Equipo> equipos;
    private List<Arbitro> arbitros;
    private List<Jornada> jornadas;
    private List<Estadio> estadios;
    private List<Jugador> jugadores;

    public Liga(String nombre, List<Equipo> equipos) {
        this.nombre = nombre;
        this.equipos = equipos;
        this.arbitros = new ArrayList<>();
        this.jugadores = new ArrayList<>();
    }

    public Liga(String nombre, String pais, int presupuesto) {
        this.nombre = nombre;
        this.equipos = new ArrayList<>();
        this.estadios = new ArrayList<>();
        this.jornadas = new ArrayList<>();
        this.arbitros = new ArrayList<>();
        this.jugadores = new ArrayList<>();
    }

    public Liga() {
        this.pais = pais;
        this.presupuesto = presupuesto;
        this.equipos = new ArrayList<>();
        this.arbitros = new ArrayList<>();
        this.jornadas = new ArrayList<>();
        this.estadios = new ArrayList<>();
        this.jugadores = new ArrayList<>();
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

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

    public List<Estadio> getEstadios() {
        return estadios;
    }

    public void setEstadios(List<Estadio> estadios) {
        this.estadios = estadios;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public void agregarequipo(String nombre, String nombre_estadio, int puntos, String nombre_aficion){
        Equipo equipo_nuevo = new Equipo(nombre, nombre_estadio, puntos, nombre_aficion);
        equipos.add(equipo_nuevo);
    }
    public void eliminarequipo(String nombre){
        for (int i = 0; i < equipos.size(); i++) {
            if (nombre.equals(equipos.get(i).getNombre())){
                equipos.remove(i);
            }
        }
    }
    public void agregarjornada(String n_jornada, String equipos_participantes, int dias_mes, int resultado, String incidencias, String revisiones){
        Jornada jornada_nueva = new Jornada(n_jornada, equipos_participantes, dias_mes, resultado, incidencias, revisiones);
        jornadas.add(jornada_nueva);
    }
    public void eliminarjornada(String n_jornada){
        for (int i = 0; i < jornadas.size(); i++) {
            if (n_jornada.equals(jornadas.get(i).getN_jornada())){
                jornadas.remove(i);
            }
        }
    }
    public void agregararbitro(String nombre, int sueldo, String nacionalidad, int n_arbitro, int amonestaciones, int expulsiones){
        Arbitro arbitro_nuevo = new Arbitro(nombre, sueldo, nacionalidad, n_arbitro, amonestaciones, expulsiones);
        arbitros.add(arbitro_nuevo);
    }
    public void eliminararbitro(int n_arbitro){
        for (int i = 0; i < arbitros.size(); i++) {
            if (n_arbitro==(arbitros.get(i).getn_arbitro())){
                arbitros.remove(i);
            }
        }
    }
    public void agregarestadios(String nombre, int capacidad, String ciudad, String equipo){
        Estadio estadio_nuevo = new Estadio(nombre, capacidad, ciudad, equipo);
        estadios.add(estadio_nuevo);
    }
    public void eliminarestadios(String nombre){
        for (int i = 0; i < estadios.size(); i++) {
            if (nombre.equals(estadios.get(i).getNombre())){
                estadios.remove(i);
            }
        }
    }
    @java.lang.Override
    public java.lang.String toString() {
        return "Liga{" +
                "nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                ", presupuesto=" + presupuesto +
                ", equipos=" + equipos +
                ", arbitros=" + arbitros +
                ", jornadas=" + jornadas +
                ", estadios=" + estadios +
                '}';
    }
}