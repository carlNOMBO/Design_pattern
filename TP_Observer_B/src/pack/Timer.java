package pack;

import java.util.Date;

public class Timer extends Thread{
    private Montre montre;
    public Timer(Montre montre){
        this.montre = montre;
    }

    public static void main(String[] args){
        Montre montre = new Montre();
        montre.setDate(new Date());
        Timer t = new Timer(montre);
        MontreDigitaleAnglaise mten = new MontreDigitaleAnglaise(montre);
        MontreDigitaleFrancaise mtfr = new MontreDigitaleFrancaise(montre);
        montre.attache(mten);
        montre.attache(mtfr);
        t.start();
    }

    public void run(){
        while (true) {
            try {
                sleep(1000);
                this.montre.setDate(new Date());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
