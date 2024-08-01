package shopping_app;

import java.util.ArrayList;
import java.util.List;

public class ShoppingManager {



    //Propietati :
    List<String> itemsList = new ArrayList<>();

    //Constructori
    //Metode


    public void start() {
        System.out.println("Shopping List App");

        showMenu();

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

    public void updateItem() {

    }

    public void deleteItem(String item) {
        boolean isPresent = isPresentInList(item);

        if (isPresent == true) {
            itemsList.remove(item);
        } else {
            System.out.println("Elementul nu a fost gasit.");
        }
    }

    public boolean isPresentInList (String item){
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
        for (int i = 0; i < itemsList.size(); i++) {
            String element = itemsList.get(i);

            System.out.println(element);
        }
    }
}
