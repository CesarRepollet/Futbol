public class Sede {
    private String pais;
    private int edicion;
    private String estadioFinal;

    public Sede(String pais, int edicion, String estadioFinal) {
        this.pais = pais;
        this.edicion = edicion;
        this.estadioFinal = estadioFinal;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public String getEstadioFinal() {
        return estadioFinal;
    }

    public void setEstadioFinal(String estadioFinal) {
        this.estadioFinal = estadioFinal;
    }

    @Override
    public String toString() {
        return "Sede{" +
                "pais='" + pais + '\'' +
                ", edicion=" + edicion +
                ", estadio_final='" + estadioFinal + '\'' +
                '}';
    }
}
