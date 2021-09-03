package pack;

import observeur.Observeur;
import observeur.Sujet;

import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;

public class Montre extends Sujet {
    private Date date;

    public Montre(){
        super();
        super.setObserveurs(new LinkedList<Observeur>());
    }
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
        this.notifier();
    }

    @Override
    public void attache(Observeur o) {
        super.getObserveurs().add(o);
    }

    @Override
    public void detache(Observeur o) {
        super.getObserveurs().remove(o);
    }

    @Override
    public void notifier() {
        Iterator<Observeur> it = super.getObserveurs().iterator();

        while (it.hasNext()){
            it.next().miseAjour();
        }

        /*super.getObserveurs().stream().forEach(observeur -> {
            observeur.miseAjour();});*/
    }
}
