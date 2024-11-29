import java.util.List;
public class Main {
    public static void main(String[] args) {
        // Crear empleados
        Organizador organizador = new Organizador("Fabricio", "Ruiz", "123456789");
        VendedorBoletos vendedor = new VendedorBoletos("Viviana", "Córdova", "987654321");
        // Crear un evento
        Evento evento = new Evento("Cena Navideña", "29/11/2024", "Universidad Nacional de Loja");
        System.out.println("Evento creado: " + evento.getNombre() + ", Fecha: " + evento.getFecha());

        // El organizador trabaja creando el evento
        organizador.trabajar();
        organizador.crearEvento();
        organizador.crearCronograma();

        // Crear boletos
        Boleto boleto1 = new Boleto("A1", 50.0f);
        Boleto boleto2 = new Boleto("A2", 50.0f);
        Boleto boleto3 = new Boleto("A3", 50.0f);
        evento.agregarBoleto(boleto1);
        evento.agregarBoleto(boleto2);
        evento.agregarBoleto(boleto3);
        System.out.println("Boletos añadidos al evento.");

        // Crear participantes
        Participante participante1 = new Participante("Luis", "Martínez", "111222333", MetodoPago.TARJETA);
        Participante participante2 = new Participante("Ana", "López", "444555666", MetodoPago.EFECTIVO);

        // Registrar participantes
        vendedor.trabajar();
        vendedor.registrarParticipante();
        evento.agregarParticipante(participante1);
        evento.agregarParticipante(participante2);

        // Participantes compran boletos
        participante1.comprarBoleto();
        boleto1.setEstado(Estado.VENDIDO);
        System.out.println("Boleto " + boleto1.getIdentificador() + " vendido a " + participante1.getNombre());

        participante2.comprarBoleto();
        boleto2.setEstado(Estado.VENDIDO);
        System.out.println("Boleto " + boleto2.getIdentificador() + " vendido a " + participante2.getNombre());

        // Generar una factura
        Factura factura = new Factura("F001", boleto1.getPrecio() + boleto2.getPrecio());
        System.out.println("Factura generada: " + factura.getNumero() + ", Monto total: $" + factura.getMontoTotal());
        factura.setNumero("F002");
        factura.setMontoTotal(boleto1.getPrecio() + boleto2.getPrecio() + boleto3.getPrecio());
        System.out.println("Factura actualizada: " + factura.getNumero() + ", Monto total: $" + factura.getMontoTotal());

        // Validar boletos
        boolean validacion = vendedor.validarBoleto();
        System.out.println("Validación de boletos: " + (validacion ? "Exitosa" : "Fallida"));

        // Mostrar información final del evento
        System.out.println("\nResumen del Evento:");
        System.out.println("Nombre: " + evento.getNombre());
        System.out.println("Fecha: " + evento.getFecha());
        System.out.println("Dirección: " + evento.getDireccion());
        System.out.println("Boletos vendidos: ");
        for (Boleto b : List.of(boleto1, boleto2, boleto3)) {
            System.out.println("- Boleto " + b.getIdentificador() + ": " + b.getEstado());
        }
    }
}