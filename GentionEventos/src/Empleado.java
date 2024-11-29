public class Empleado extends Persona implements Contrato {
    public Empleado(String nombre, String apellido, String cedula) {
        super(nombre, apellido, cedula);
    }

    @Override
    public void trabajar() {
        System.out.println("Empleado está trabajando...");
    }
}
