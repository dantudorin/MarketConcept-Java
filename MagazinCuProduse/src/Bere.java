public class Bere extends Produs {
        double procentAlcool;

        public Bere(String nume, double pret, double procentAlcool){
                super(nume,pret);
                this.procentAlcool = procentAlcool;
        }

    @Override
    public String toString() {
        return "Bere{" +
                "procentAlcool=" + procentAlcool +
                ", nume='" + nume + '\'' +
                ", pret=" + pret +
                '}';
    }

    public double getProcentAlcool() {
        return procentAlcool;
    }

    public void setProcentAlcool(double procentAlcool) {
        this.procentAlcool = procentAlcool;
    }
}
