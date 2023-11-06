import java.util.ArrayList;
import java.util.List;

public class GrupoVehiculos extends ComponenteVehiculo {
    private List<ComponenteVehiculo> vehiculos = new ArrayList<>();
    private String nombre;

    public GrupoVehiculos(String nombre) {
        this.nombre = nombre;
    }

    public void agregarVehiculo(ComponenteVehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Grupo de Vehículos: " + nombre);
        for (ComponenteVehiculo vehiculo : vehiculos) {
            vehiculo.mostrarInformacion();
        }
    }
}
