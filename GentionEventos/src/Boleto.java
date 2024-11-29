public class Boleto {
    private String identificador;
    private float precio;
    private Estado estado;

    public Boleto(String identificador, float precio) {
        this.identificador = identificador;
        this.precio = precio;
        this.estado = Estado.DISPONIBLE;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}