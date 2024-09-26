package classi;


public class Dirigente extends Dipendenti {
    public Dirigente(double stipendio, Dipartimenti dipartimenti) {
        super(stipendio, dipartimenti);
    }

    @Override
    public double calculateSalary() {
        return this.stipendio;
    }
}
