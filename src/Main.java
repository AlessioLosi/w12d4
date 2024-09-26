import classi.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Calcolo stipendi");
        Dirigente dirigente= new Dirigente(2500,Dipartimenti.AMMINISTAZIONE);
       DipendenteFullTime dipendenteFullTime = new DipendenteFullTime(1800,Dipartimenti.PRODUZIONE);
        DipendentePartTime dipendentePartTime = new DipendentePartTime(10 ,Dipartimenti.VENDITE, 150);

        Dipendenti[] arrayDipendenti = {dirigente, dipendentePartTime, dipendenteFullTime};

        double totaleStipendi = 0;
        for (Dipendenti dipendente : arrayDipendenti) {
            System.out.println(dipendente);
            totaleStipendi += dipendente.calculateSalary();
    }
}}