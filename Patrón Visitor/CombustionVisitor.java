// En comparación con el patrón Bridge, agregamos la función CombustionVisitor

public class CombustionVisitor implements Visitor {
    public void visit(Nissan nissan) {
        nissan.combustion(100, true);
    }
}
