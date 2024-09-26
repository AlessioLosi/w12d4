package classi;

import interfaces.Checkin;

public class Volontario  implements Checkin {
    public String Nome;
    public int Età;
    public boolean Cv;
    public double OrarioInizio;

    public Volontario(String Nome, int Età, boolean Cv, double orarioInizio) {
        this.Nome = Nome;
        this.Età = Età;
        this.Cv = Cv;
        this.OrarioInizio=OrarioInizio;
    }
    @Override
    public void checkIn() {
        System.out.println(Nome + "di anni "+ Età + " ha iniziato il suo servizio come volontario alle ore:"+ OrarioInizio);
    }

}
