import java.util.Scanner;

public class Program {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String fullCommand;
        String[] splittedCommand;

        while(true){
            System.out.println("Dati o comanda in program!");
            fullCommand = scanner.nextLine();
            splittedCommand = fullCommand.split(" ");

            switch (splittedCommand[0]){

                case "Display" :
                                    new Magazin().getInstance().displayProduse();
                                    break;

                case "AddBeer" :
                                    new Magazin().getInstance().adaugaProdus(new Bere(splittedCommand[1],Double.parseDouble(splittedCommand[2]),Double.parseDouble(splittedCommand[3])));
                                    break;

                case "AddChocolate" :
                                    new Magazin().getInstance().adaugaProdus(new Ciocolata(splittedCommand[1],Double.parseDouble(splittedCommand[2]),Double.parseDouble(splittedCommand[3])));
                                    break;

                case "Remove" :
                                    new Magazin().getInstance().stergeProdus();
                                    break;

                case "Exit" :
                                    return;
            }
        }

    }

}
