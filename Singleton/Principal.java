// Implementación de Patrón Creacional Singleton - Presentado por: DavidVelásquez

public class Principal {
    public static void main(String[] args) {
        VehiculoFactory factory = VehiculoFactory.getInstance();

        ComponenteVehiculo automovil1 = factory.crearVehiculo("Automóvil Deportivo");
        ComponenteVehiculo motocicleta = factory.crearVehiculo("Motocicleta");

        ComponenteVehiculo automovil2 = factory.crearVehiculo("Automóvil Familiar");

        GrupoVehiculos grupoDeportivos = factory.crearGrupoVehiculos("Deportivos");
        grupoDeportivos.agregarVehiculo(automovil1);
        grupoDeportivos.agregarVehiculo(motocicleta);

        GrupoVehiculos grupoPrincipal = factory.crearGrupoVehiculos("Vehículos");
        grupoPrincipal.agregarVehiculo(grupoDeportivos);
        grupoPrincipal.agregarVehiculo(automovil2);

        grupoPrincipal.mostrarInformacion();
    }
}
