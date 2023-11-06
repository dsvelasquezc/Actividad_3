public class Nissan extends Motor {
    Nissan(Bateria bateria) {
        super(bateria);
    }

    public void combustion(int mezcla, boolean chispa) {
        if (chispa && bateria.getEsCargada()) {
            System.out.println("El motor está haciendo combustión");
        } else {
            if (chispa) {
                System.out.println("La batería del motor Nissan está descargada");
            } else {
                System.out.println("No llegó la chispa al motor Nissan");
            }
        }
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
