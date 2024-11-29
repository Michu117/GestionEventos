public class Factura {
    private String numero;
    private float montoTotal;

    public Factura(String numero, float montoTotal) {
        this.numero = numero;
        this.montoTotal = montoTotal;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public float getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(float montoTotal) {
        this.montoTotal = montoTotal;
    }
}