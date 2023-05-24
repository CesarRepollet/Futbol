public class Sede {
    private String pais;
    private int edicion;
    private String estadio_final;

    public Sede(String pais, int edicion, String estadio_final) {
        this.pais = pais;
        this.edicion = edicion;
        this.estadio_final = estadio_final;
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

    public String getEstadio_final() {
        return estadio_final;
    }

    public void setEstadio_final(String estadio_final) {
        this.estadio_final = estadio_final;
    }

    @Override
    public String toString() {
        return "Sede{" +
                "pais='" + pais + '\'' +
                ", edicion=" + edicion +
                ", estadio_final='" + estadio_final + '\'' +
                '}';
    }
}
