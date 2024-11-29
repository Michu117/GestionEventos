public class Organizador extends Empleado {
    public Organizador(String nombre, String apellido, String cedula) {
        super(nombre, apellido, cedula);
    }

    @Override
    public void trabajar() {
        System.out.println("Organizador está creando eventos...");
    }

    public void crearEvento() {
        System.out.println("Evento creado por el Organizador.");
    }

    public void crearCronograma() {
        System.out.println("Cronograma creado para el evento.");
    }

}