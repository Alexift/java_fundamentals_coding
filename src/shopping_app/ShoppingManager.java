package shopping_app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingManager {


    //Propietati :
    List<String> itemsList = new ArrayList<>();

    //Constructori
    //Metode


    public void start() {
        System.out.println("Shopping List App");

        Scanner scanner = new Scanner(System.in);

        Boolean isRunnung = true;

        while (isRunnung) {

            showMenu();

            String option = scanner.next();
            scanner.nextLine();


            switch (option) {

                case "1":
                    System.out.println("introduceti un Item :");
                    String item = scanner.nextLine();
                    addItem(item);
                    break;

                case "2":
                    System.out.println("Introduceti Item-ul pe care doriti sa il modificati:");
                    String oldItem = scanner.nextLine();

                    System.out.println("Introduceti item-ul now");
                    String newItem = scanner.nextLine();

                    updateItem(oldItem, newItem);
                    break;

                case "3":
                    System.out.println("introduceti un Item pentru stergere :");

                    String itemForDelete = scanner.nextLine();
                    deleteItem(itemForDelete);
                    break;

                case "4":
                    showItemsList();
                    break;

                case "5":
                    itemsList.clear();
                    break;

                case "6":
                    isRunnung = false;
                    break;

                default:
                    System.out.println("Optiunea nu exista !");


            }
            System.out.println("---------------------------------------");

        }
        // variabila item de mai sus stocheaza cea ce citim de la tastatura
        // metoda addItem() , primeste ca si parametru o variabila de tip String , aceasta variabila contine valoare citita de la tastat.
        // addItem(item) - prin aceasta linie trmitem valoare citita din moetoda start() , in metoda addItem.


    }

    private void showMenu() {
        System.out.println("1. Introducere element:");
        System.out.println("2. Modificare element");
        System.out.println("3. Stergere element");
        System.out.println("4. Afisare lista");
        System.out.println("5. Golire lista");
        System.out.println("6. Oprire");

    }

    public void addItem(String item) {
        boolean isPresent = isPresentInList(item);

        if (isPresent == true) {
            System.out.println("Elementul exista in lista .");
        } else {
            itemsList.add(item);
        }
    }

    public void updateItem(String oldItem, String newItem) {
        //varianta 1
//        deleteItem(oldItem);
//        addItem(newItem);

        //varianta 2
        //Metoda Set ne ajuta sa modificam un element de pe o pozitie anume (index)
        Boolean isPresent = isPresentInList(oldItem);
        if (isPresent == false) {
            System.out.println("elementul nu existra ");
        } else {
            for (int i = 0; i < itemsList.size(); i++) {
                String element = itemsList.get(i);
                if (oldItem.equalsIgnoreCase(element)) {
                    itemsList.set(i, newItem);

                }
            }
        }
    }

    public void deleteItem(String item) {
        boolean isPresent = isPresentInList(item);

        if (isPresent == true) {
            itemsList.remove(item);
        } else {
            System.out.println("Elementul nu a fost gasit.");
        }
    }

    public boolean isPresentInList(String item) {
        boolean isPresent = false;

        for (int i = 0; i < itemsList.size(); i++) {
            String element = itemsList.get(i);

            if (item.equalsIgnoreCase(element)) {

                isPresent = true;
            }

        }
        return isPresent;
    }

    public void showItemsList() {
        for (String element : itemsList) {
            System.out.println(element);
        }
        //        for (int i = 0; i < itemsList.size(); i++) {
        //            String element = itemsList.get(i);
        //
        //            System.out.println(element);
        //        }
    }
}
