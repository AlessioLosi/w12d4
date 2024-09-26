package classi;
public class DipendenteFullTime extends Dipendenti{
    public DipendenteFullTime (double stipendio, Dipartimenti dipartimenti) {super(stipendio, dipartimenti);}

    @Override
    public double calculateSalary() {
        return this.getStipendio();
}}

