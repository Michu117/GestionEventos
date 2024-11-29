public class VendedorBoletos extends Empleado {
    public VendedorBoletos(String nombre, String apellido, String cedula) {
        super(nombre, apellido, cedula);
    }

    @Override
    public void trabajar() {
        System.out.println("Vendedor está vendiendo boletos...");
    }

    public void registrarParticipante() {
        System.out.println("Participante registrado.");
    }

    public boolean validarBoleto() {
        System.out.println("Boleto validado.");
        return true;
    }

    public void generarFactura() {
        System.out.println("Factura generada.");
    }
}
