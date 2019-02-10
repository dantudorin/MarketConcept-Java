public class Ciocolata extends Produs {

    double calorii;

    public Ciocolata(String nume, double pret, double calorii){
        super(nume,pret);
        this.calorii = calorii;
    }

    @Override
    public String toString() {
        return "Ciocolata{" +
                "calorii=" + calorii +
                ", nume='" + nume + '\'' +
                ", pret=" + pret +
                '}';
    }

    public double getCalorii() {
        return calorii;
    }

    public void setCalorii(double calorii) {
        this.calorii = calorii;
    }
}
