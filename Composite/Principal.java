// Implementación de Patrón Estructural Composite - Presentado por: DavidVelásquez

public class Principal {
    public static void main(String[] args) {
        ComponenteVehiculo automovil1 = new VehiculoIndividual("Automóvil Deportivo");
        ComponenteVehiculo motocicleta = new VehiculoIndividual("Motocicleta");

        ComponenteVehiculo automovil2 = new VehiculoIndividual("Automóvil Familiar");

        GrupoVehiculos grupoDeportivos = new GrupoVehiculos("Deportivos");
        grupoDeportivos.agregarVehiculo(automovil1);
        grupoDeportivos.agregarVehiculo(motocicleta);

        GrupoVehiculos grupoPrincipal = new GrupoVehiculos("Vehículos");
        grupoPrincipal.agregarVehiculo(grupoDeportivos);
        grupoPrincipal.agregarVehiculo(automovil2);

        grupoPrincipal.mostrarInformacion();
    }
}
