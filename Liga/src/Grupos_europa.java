import java.util.List;

public class Grupos_europa {
    private String nombre_grupo;
    private String equipo1;
    private String equipo2;
    private String equipo3;
    private String equipo4;
    private int puntose1;
    private int puntose2;
    private int puntose3;
    private int puntose4;

    private List<Equipo> equipos;
    private List<Estadio> estadios;
    private List<Jornadas_europa> jornadasEuropas;
    private List<Arbitro> arbitros;

    public Grupos_europa() {
    }

    public Grupos_europa(String nombre_grupo, String equipo1, String equipo2, String equipo3, String equipo4, int puntose1, int puntose2, int puntose3, int puntose4) {
        this.nombre_grupo = nombre_grupo;
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.equipo3 = equipo3;
        this.equipo4 = equipo4;
        this.puntose1 = puntose1;
        this.puntose2 = puntose2;
        this.puntose3 = puntose3;
        this.puntose4 = puntose4;
    }

    public String getNombre_grupo() {
        return nombre_grupo;
    }

    public void setNombre_grupo(String nombre_grupo) {
        this.nombre_grupo = nombre_grupo;
    }

    public String getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(String equipo1) {
        this.equipo1 = equipo1;
    }

    public String getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(String equipo2) {
        this.equipo2 = equipo2;
    }

    public String getEquipo3() {
        return equipo3;
    }

    public void setEquipo3(String equipo3) {
        this.equipo3 = equipo3;
    }

    public String getEquipo4() {
        return equipo4;
    }

    public void setEquipo4(String equipo4) {
        this.equipo4 = equipo4;
    }

    public int getPuntose1() {
        return puntose1;
    }

    public void setPuntose1(int puntose1) {
        this.puntose1 = puntose1;
    }

    public int getPuntose2() {
        return puntose2;
    }

    public void setPuntose2(int puntose2) {
        this.puntose2 = puntose2;
    }

    public int getPuntose3() {
        return puntose3;
    }

    public void setPuntose3(int puntose3) {
        this.puntose3 = puntose3;
    }

    public int getPuntose4() {
        return puntose4;
    }

    public void setPuntose4(int puntose4) {
        this.puntose4 = puntose4;
    }

    public List<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(List<Equipo> equipos) {
        this.equipos = equipos;
    }

    public List<Estadio> getEstadios() {
        return estadios;
    }

    public void setEstadios(List<Estadio> estadios) {
        this.estadios = estadios;
    }

    public List<Jornadas_europa> getJornadasEuropas() {
        return jornadasEuropas;
    }

    public void setJornadasEuropas(List<Jornadas_europa> jornadasEuropas) {
        this.jornadasEuropas = jornadasEuropas;
    }

    public List<Arbitro> getArbitros() {
        return arbitros;
    }

    public void setArbitros(List<Arbitro> arbitros) {
        this.arbitros = arbitros;
    }
}