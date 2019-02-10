===================================
	Magazin Concept
===================================


===================================
Limbaj de programare : JAVA
IDE : INTELLIJ
Scurta descriere a programului: avem un singur magazin pe care il populam cu 2 tipuri de produse : ciocolata si bere. De asemenea putem sa afisam produsele, dar la fel
				de bine le putem si elimina;
====================================



:::::::Structura Programului::::::::::

-> folosim o clasa abstracta Produs ce prezinta 2 atribute : nume(reprezinta numele produsului) si pretul. Aceasta clasa nu poate fi instantiata. De asemenea vom adauga
   adauga getteri si setteri pentru aceasta clasa abstracta. In clasa Produs am mai suprascris metoda "toString()" pentru a putea afisa produsele ce se vor adauga in magazin.

-> am definit clasa Bere (reprezinta un obiect care poate fi adaugat intr-un magazin). Aceasta clasa mosteneste clasa Produs si contine in plus atributul procentAlcool.
   Constructorul cu cei 3 parametrii apeleaza metoda super() pentru a putea seta numele si pretul produsului creat. Si aici, ca si in clasa Produs s-au introdus getteri si setteri
   precum s-a si suprascris metoda  "toString()";

-> am definit clasa Ciocolata ce este similiara cu clasa Bere, singura diferenta intre ele o face numele atributului "calorii";

-> am definit propria noastra constrangere prin clasa PreaMulteProduseException ce mosteneste clasa RuntimeException. Aceasta exceptie este chemata in momentul in care in magazin
   se afla mai mult de 100 de produse. Chemarea acestei metode o sa produca intreruperea programului.

-> clasa Magazin este o clasa de tip SINGLETON, deoarece in aplicatia noastra nu se face referire decat la o singura instanta de magazin. Procedeul de realizarii al clasei SINGLETON
   nu este THREAD SAFE. Clasa contine o lista "List<Produs> listaProduse = new ArrayList<>()" ce stocheaza toate produsele din magazin. Am definit functia "getInstance()" pentru a putea
   returna de fiecare data aceeasi instanta de magazin creeata. Metodele "displayProduse()" (afiseaza toate produsele existente in magazin), "adaugaProdus(Produs p)" (adauga produsul in "listaProduse"),
   si "stergeProdus()" completeaza metodele clasei Magazin.

-> programul se executa in clasa "Program" unde am folosit o instanta de Scanner pentru a putea citi de la tastatura comanda dorita. Tipurile de comenzi ce pot fi rulate sunt:

-----> Display
-----> AddBeer (String)NumeBere (double)Pret (double)ProcentAlcool
-----> AddChocolate (String)NumeCiocolata (double)Pret (double)ProcentAlcool
-----> Exit


::::Pentru separarea comenzilor am folosit un switch(), iar pentru separarea atributelor am folosit command.split(" ").
::::Pentru afisarea tuturor produselor din lista de produse ne-am folosit de rescrierea metodei "toString()" si de conversia ArrayList-ului in Stream si am apelat metoda "println"



_____________________________
Pentru fiecare dintre operatiile de mai sus se cheama instanta de Magazin creeata prin sintaxa "new Magazin().getInstance()" si se aplica operatia corespunzatoare
Programul lucreaza in bucla infinita pana ce utilizatorul introduce comanda "Exit"
______________________________


========================================
Pentru a accesa clasele programului se acceseaza folderul MagazinCuProduse ----> src
========================================