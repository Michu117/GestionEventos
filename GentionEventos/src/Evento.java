import java.util.ArrayList;
import java.util.List;

public class Evento {
    private String nombre;
    private String fecha;
    private String direccion;
    private List<Boleto> boletos;
    private List<Participante> participantes;

    public Evento(String nombre, String fecha, String direccion) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.direccion = direccion;
        this.boletos = new ArrayList<>();
        this.participantes = new ArrayList<>();
    }

    // Getters y métodos para gestionar boletos y participantes
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void agregarBoleto(Boleto boleto) {
        boletos.add(boleto);
    }

    public void agregarParticipante(Participante participante) {
        participantes.add(participante);
    }
}
