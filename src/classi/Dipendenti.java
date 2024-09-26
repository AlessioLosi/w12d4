package classi;

import interfaces.Checkin;

import java.util.Random;

public abstract class Dipendenti implements Checkin {
    private int matricola;
    private double stipendio;
    private Dipartimenti dipartimenti;
    public double OrarioInizio;


    public int getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public Dipartimenti getDipartimenti() {
        return dipartimenti;
    }

    public void setDipartimenti(Dipartimenti dipartimenti) {
        this.dipartimenti = dipartimenti;
    }

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

