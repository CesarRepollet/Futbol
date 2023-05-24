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
    private List<Estadio> estadios;
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

    public List<Estadio> getEstadios() {
        return estadios;
    }

    public void setEstadios(List<Estadio> estadios) {
        this.estadios = estadios;
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
}
