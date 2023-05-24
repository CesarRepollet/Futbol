import java.util.ArrayList;
import java.util.List;

public class Europea {
    private String nombre;
    private int edicion;
    private String anterior_campeon;
    private String ronda_eliminatoria;

    private List<Equipo> equipos;
    private List<Jugador> jugadores;
    private List<Arbitro> arbitros;
    private List<Jornadas_europa> jornadasEuropas;
    private List<Estadio> estadios;
    private List<Grupos_europa> gruposEuropas;


    public Europea() {
    }

    public Europea(String nombre, int edicion, String anterior_campeon, String ronda_eliminatoria) {
        this.nombre = nombre;
        this.edicion = edicion;
        this.anterior_campeon = anterior_campeon;
        this.ronda_eliminatoria = ronda_eliminatoria;
        this.gruposEuropas = new ArrayList<>();
        this.equipos = new ArrayList<>();
        this.arbitros = new ArrayList<>();
        this.jornadasEuropas = new ArrayList<>();
        }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public String getAnterior_campeon() {
        return anterior_campeon;
    }

    public void setAnterior_campeon(String anterior_campeon) {
        this.anterior_campeon = anterior_campeon;
    }

    public String getRonda_eliminatoria() {
        return ronda_eliminatoria;
    }

    public void setRonda_eliminatoria(String ronda_eliminatoria) {
        this.ronda_eliminatoria = ronda_eliminatoria;
    }

    public List<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(List<Equipo> equipos) {
        this.equipos = equipos;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public List<Arbitro> getArbitros() {
        return arbitros;
    }

    public void setArbitros(List<Arbitro> arbitros) {
        this.arbitros = arbitros;
    }

    public List<Jornadas_europa> getJornadasEuropas() {
        return jornadasEuropas;
    }

    public void setJornadasEuropas(List<Jornadas_europa> jornadasEuropas) {
        this.jornadasEuropas = jornadasEuropas;
    }

    public List<Estadio> getEstadios() {
        return estadios;
    }

    public void setEstadios(List<Estadio> estadios) {
        this.estadios = estadios;
    }

    public List<Grupos_europa> getGruposEuropas() {
        return gruposEuropas;
    }

    public void setGruposEuropas(List<Grupos_europa> gruposEuropas) {
        this.gruposEuropas = gruposEuropas;
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
        Jornadas_europa jornada_nueva = new Jornadas_europa(n_jornada, equipos_participantes, dias_mes, resultado, incidencias, revisiones);
        jornadasEuropas.add(jornada_nueva);
    }
    public void eliminarjornada(String n_jornada){
        for (int i = 0; i < jornadasEuropas.size(); i++) {
            if (n_jornada.equals(jornadasEuropas.get(i).getN_jornada())){
                jornadasEuropas.remove(i);
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
    public void agregargrupos(String nombre_grupo, String equipo1, String equipo2, String equipo3, String equipo4, int puntose1, int puntose2, int puntose3, int puntose4){
        Grupos_europa grupo_nuevo = new Grupos_europa(nombre_grupo, equipo1, equipo2, equipo3, equipo4, puntose1, puntose2, puntose3, puntose4);
        gruposEuropas.add(grupo_nuevo);
    }
    public void eliminargrupos(String nombre_grupo){
        for (int i = 0; i < gruposEuropas.size(); i++) {
            if (nombre_grupo.equals(gruposEuropas.get(i).getNombre_grupo())){
                gruposEuropas.remove(i);
            }
        }
    }
}