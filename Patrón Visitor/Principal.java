// Implementación de Patrón de Comportamiento Visitor - Presentado por: DavidVelásquez

public class Principal {
    public static void main(String[] args) {
        Bateria vartaCargada = new Varta(true);
        Bateria vartaDescargada = new Varta(false);

        Nissan gtr = new Nissan(vartaCargada);
        Nissan gtr2 = new Nissan(vartaDescargada);

        CombustionVisitor combustionVisitor = new CombustionVisitor();

        gtr.accept(combustionVisitor);
        gtr2.accept(combustionVisitor);
    }
}