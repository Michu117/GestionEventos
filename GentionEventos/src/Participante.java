import java.util.ArrayList;
import java.util.List;

public class Participante extends Persona {
    private String metodoPago;
    private List<Evento> eventos;

    public Participante(String nombre, String apellido, String cedula, MetodoPago metodoPago) {
        super(nombre, apellido, cedula);
        this.metodoPago = metodoPago.toString();
        this.eventos = new ArrayList<>();
    }

    // Método para comprar un boleto
    public void comprarBoleto() {
        System.out.println(this.getNombre() + " ha comprado un boleto usando " + metodoPago);
    }

    // Método para consultar los eventos en los que el participante está inscrito
    public void consultarEventos() {
        if (eventos.isEmpty()) {
            System.out.println(this.getNombre() + " no está inscrito en ningún evento.");
        } else {
            System.out.println(this.getNombre() + " está inscrito en los siguientes eventos:");
            for (Evento evento : eventos) {
                System.out.println("- " + evento.getNombre() + " en " + evento.getFecha());
            }
        }
    }

    // Método para agregar un evento al participante
    public void agregarEvento(Evento evento) {
        eventos.add(evento);
    }

    // Getter para el nombre del participante
    public String getNombre() {
        return super.getNombre();
    }
}
