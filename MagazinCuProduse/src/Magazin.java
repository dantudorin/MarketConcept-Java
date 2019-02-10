import java.util.ArrayList;
import java.util.List;

public class Magazin {

    private List<Produs> listaProduse = new ArrayList<>();
    private static Magazin instance;

    public Magazin getInstance(){

        if(instance == null){
            instance = new Magazin();
        }

        return instance;
    }

    public void adaugaProdus(Produs produs){

        if(listaProduse.size() < 100){
            listaProduse.add(produs);
        }else{
            throw new PreaMulteProduseException();
        }
    }

    public void displayProduse(){
        listaProduse.stream().forEach(System.out::println);
    }

    public void stergeProdus(){
        try{
            listaProduse.remove(0);
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
}
