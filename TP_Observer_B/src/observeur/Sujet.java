package observeur;

import java.util.List;

public abstract class Sujet {
    private List<Observeur> observeurs;

    public abstract void attache(Observeur o);
    public abstract void detache(Observeur o);
    public abstract void notifier();

    public List<Observeur> getObserveurs() {
        return observeurs;
    }

    public void setObserveurs(List<Observeur> observeurs) {
        this.observeurs = observeurs;
    }
}
