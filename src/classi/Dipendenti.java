package classi;

import interfaces.Checkin;

import java.util.Random;

public abstract class Dipendenti implements Checkin {
    public int matricola;
    public double stipendio;
    public Dipartimenti dipartimenti;
    public double OrarioInizio;

    public Dipendenti(double stipendio, Dipartimenti dipartimenti) {
        Random random= new Random();
        this.stipendio = stipendio;
        this.dipartimenti = dipartimenti;
        this.matricola= random.nextInt(10000,100000);
        this.OrarioInizio=OrarioInizio;
    }
    public void checkIn() {
        System.out.println(matricola + " ha iniziato il suo turno di lavoro alle ore"+ OrarioInizio);
    }

    public abstract double calculateSalary();
    @Override
    public String toString() {
        return "Dipendente{" +
                "matricola=" + matricola +
                ", stipendio=" + stipendio +
                ", dipartimento=" + dipartimenti +
                '}';
    }
}

