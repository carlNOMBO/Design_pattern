package pack;

import observeur.Observeur;

public class MontreDigitaleFrancaise implements Observeur {
    private Montre montre;

    public MontreDigitaleFrancaise(Montre montre) {
        this.montre = montre;
    }

    @Override
    public void miseAjour() {
        System.out.println("Montre fr: "+this.montre.getDate());
    }
}
