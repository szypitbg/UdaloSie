public class Mnożenie {
    private double liczba1, liczba2;

    public Mnożenie(double liczba1, double liczba2){
        this.liczba1 = liczba1;
        this.liczba2 = liczba2;
    }
    public double rozwiąż()
    {
        double rozwiązanie = liczba1*liczba2;
        return rozwiązanie;
    }

    public void setLiczba1(double liczba1) {
        this.liczba1 = liczba1;
    }

    public void setLiczba2(double liczba2) {
        this.liczba2 = liczba2;
    }
}
