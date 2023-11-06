public class VehiculoFactory {
    private static VehiculoFactory instance;

    private VehiculoFactory() {
    }

    public static VehiculoFactory getInstance() {
        if (instance == null) {
            instance = new VehiculoFactory();
        }
        return instance;
    }

    public ComponenteVehiculo crearVehiculo(String nombre) {
        return new VehiculoIndividual(nombre);
    }

    public GrupoVehiculos crearGrupoVehiculos(String nombre) {
        return new GrupoVehiculos(nombre);
    }
}
