package classi;

public class DipendentePartTime extends Dipendenti{
    public double orelavorate;
    public DipendentePartTime (double stipendio, Dipartimenti dipartimenti, double orelavorate)
    {super(stipendio, dipartimenti);
    this.orelavorate = orelavorate;}
@Override
    public double calculateSalary() {
        return orelavorate*this.stipendio;
    }
    @Override
    public String toString() {
        return "Dipendente{" +
                "matricola=" + matricola +
                ", stipendio=" + this.calculateSalary() +
                ", dipartimento=" + dipartimenti +
                '}';
    }
}
