package pack;

import observeur.Observeur;

import java.util.Observer;

public class MontreDigitaleAnglaise implements Observer {
    private Montre montre;

    public MontreDigitaleAnglaise(Montre montre) {
        this.montre = montre;
    }

    @Override
    public void miseAjour() {
        System.out.println("Montre en: "+this.montre.getDate());
    }
}
