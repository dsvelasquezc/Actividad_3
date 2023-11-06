public class VehiculoIndividual extends ComponenteVehiculo {
    private String nombre;

    public VehiculoIndividual(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Vehículo: " + nombre);
    }
}
