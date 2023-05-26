import java.util.List;

public class Seleccion {
    private String seleccion;
    private int puntos;
    private String nombre_aficion;
    private List<Jugador> jugadores;
    private List<Estadio> estadios;

    public Seleccion() {
    }

    public Seleccion(String seleccion, int puntos, String nombre_aficion) {
        this.seleccion = seleccion;
        this.puntos = puntos;
        this.nombre_aficion = nombre_aficion;
    }

    public String getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(String seleccion) {
        this.seleccion = seleccion;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public String getNombre_aficion() {
        return nombre_aficion;
    }

    public void setNombreAficion(String nombre_aficion) {
        this.nombre_aficion = nombre_aficion;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public List<Estadio> getEstadios() {
        return estadios;
    }

    public void setEstadios(List<Estadio> estadios) {
        this.estadios = estadios;
    }
    public void agregarjugador(String nombre, String apellidos, int idjugador, int edad, int numero, int goles, int asistencias, int tarjetas_amarillas, int tarjetas_rojas){
        Jugador jugador_Nuevo = new Jugador(nombre, apellidos, idjugador, edad, numero, goles, asistencias, tarjetas_amarillas, tarjetas_rojas);
        jugadores.add(jugador_Nuevo);
    }
    public void eliminarjugador(int idjugador){
        for (int i = 0; i < jugadores.size(); i++) {
            if (idjugador==(jugadores.get(i).getidjugador())){
                jugadores.remove(i);
            }
        }
    }
}
