import java.util.ArrayList;
import java.util.List;

public class Internacional {
    private String nombre;
    private int edicion;
    private String anterior_campeon;
    private String ronda_eliminatoria;
    private String estadio_final;

    private List<Seleccion> selecciones;
    private List<Jugador> jugadores;
    private List<Arbitro> arbitros;
    private List<Sede> sedes;
    private List<Jornada_internacional> jornadasInternacionals;
    private List<Grupos_internacional> gruposInternacionals;
    public Internacional() {
    }

    public Internacional(String nombre, int edicion, String anterior_campeon, String ronda_eliminatoria, String estadio_final) {
        this.nombre = nombre;
        this.edicion = edicion;
        this.anterior_campeon = anterior_campeon;
        this.ronda_eliminatoria = ronda_eliminatoria;
        this.estadio_final = estadio_final;
        this.selecciones = new ArrayList<>();
        this.sedes = new ArrayList<>();
        this.arbitros = new ArrayList<>();
        this.gruposInternacionals = new ArrayList<>();
        this.jornadasInternacionals = new ArrayList<>();
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

    public String getEstadio_final() {
        return estadio_final;
    }

    public void setEstadio_final(String estadio_final) {
        this.estadio_final = estadio_final;
    }

    public List<Seleccion> getSelecciones() {
        return selecciones;
    }

    public void setSelecciones(List<Seleccion> selecciones) {
        this.selecciones = selecciones;
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

    public List<Jornada_internacional> getJornadasInternacionals() {
        return jornadasInternacionals;
    }

    public void setJornadasInternacionals(List<Jornada_internacional> jornadasInternacionals) {
        this.jornadasInternacionals = jornadasInternacionals;
    }

    public List<Grupos_internacional> getGruposInternacionals() {
        return gruposInternacionals;
    }

    public void setGruposInternacionals(List<Grupos_internacional> gruposInternacionals) {
        this.gruposInternacionals = gruposInternacionals;
    }

    public List<Sede> getSedes() {
        return sedes;
    }

    public void setSedes(List<Sede> sedes) {
        this.sedes = sedes;
    }

    public void agregarseleccion(String seleccion, int puntos, String nombre_aficion){
        Seleccion seleccion_nueva = new Seleccion(seleccion, puntos, nombre_aficion);
        selecciones.add(seleccion_nueva);
    }
    public void eliminarseleccion(String seleccion){
        for (int i = 0; i < selecciones.size(); i++) {
            if (seleccion.equals(selecciones.get(i).getSeleccion())){
                selecciones.remove(i);
            }
        }
    }
    public void agregarjornada(String n_jornada, String equipos_participantes, int dias_mes, int resultado, String incidencias, String revisiones){
        Jornada_internacional jornada_nueva = new Jornada_internacional(n_jornada, equipos_participantes, dias_mes, resultado, incidencias, revisiones);
        jornadasInternacionals.add(jornada_nueva);
    }
    public void eliminarjornada(String n_jornada){
        for (int i = 0; i < jornadasInternacionals.size(); i++) {
            if (n_jornada.equals(jornadasInternacionals.get(i).getN_jornada())){
                jornadasInternacionals.remove(i);
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
    public void agregarsede(String pais, int edicion, String estadio_final){
        Sede sede_nueva = new Sede(pais, edicion, estadio_final);
        sedes.add(sede_nueva);
    }
    public void eliminarsede(int edicion){
        for (int i = 0; i < sedes.size(); i++) {
            if (edicion==(sedes.get(i).getEdicion())){
                sedes.remove(i);
            }
        }
    }
    public void agregargrupo(String nombre_grupo, String equipo1, String equipo2, String equipo3, String equipo4, int puntose1, int puntose2, int puntose3, int puntose4){
        Grupos_internacional Grupo_nuevo = new Grupos_internacional(nombre_grupo, equipo1, equipo2, equipo3, equipo4, puntose1, puntose2, puntose3, puntose4);
        gruposInternacionals.add(Grupo_nuevo);
    }
    public void eliminargrupo(String nombre_grupo){
        for (int i = 0; i < gruposInternacionals.size(); i++) {
            if (nombre_grupo.equals(gruposInternacionals.get(i).getNombre_grupo())){
                gruposInternacionals.remove(i);
            }
        }
    }
}
