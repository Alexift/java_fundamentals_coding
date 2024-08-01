package obiecte_clase;

//*Keyword STATIC
//* - se foloseste pentru: proprietati, metode, clase (nu se foloseste pentru constructori)
//* - atunci cand o proprietate/variabila/clasa/metoda este statica, se aloca spatiu in memorie la pornirea aplicatiei
//* - intr-o metoda statica NU putem apela proprietati (variabile) sau metode care nu sunt statice
//* - pentru a apela o proprietate/metoda/clasa statica, folosim NUMELE CLASEI . NUMELE PRORIETATII/METODEI/CLASEI => Dog.bark() nu folosim instanta clasei, adica rex.bark()
//* - elementele statice sunt independente de obiecte. Acestea depind de clasa, nu de instanta lor

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dog rex = new Dog("Labrador", 2, "Rex");
        String rexText = rex.toString();
        System.out.println(rexText);

        System.out.println(rex);

        Dog lady = new Dog("Bichon", 5, "Lady");
        System.out.println(lady);

        Dog rex2 = new Dog("Labrador", 2, "Rex");
        System.out.println(rex2);

        //NU FOLOSIM == ATUNCI CAND DORIM SA COMPARAM 2 BIECTE

        if (rex == rex2) {
            System.out.println("Obiectele sunt egale");
        } else {
            System.out.println("Obiectele nu sunt egale");
        }

        //FOLOSIM .EQUALS () PENTRU A COMPARA 2 OBIECTE
        if (rex.equals(rex2)) {
            System.out.println("Obiectele sunt egale");
        } else {
            System.out.println("Obiectele nu sunt egale");

        }

        // addDog();
        dogManagers();

    }

    public static Dog addDog() {
        System.out.println("Add Dog");
        Scanner scanner = new Scanner(System.in);


        System.out.println("Insert Name: ");

        String name = scanner.nextLine();

        System.out.println("insert race: ");
        String race = scanner.nextLine();

        System.out.println("Insert age: ");
        int age = scanner.nextInt();

        scanner.close();

        // Dog - tipul variabilei , in acest caz Clasa Dog.
        // variabilaDeTipDog - este numele variabilei
        // = - operator de atiribuire ( Initializere )
        // new Dog() - reprezinta apelul constructorului din clasa Dog

        Dog variablaDeTipDog = new Dog(race, age, name);

        Integer number = 0;

        String text = "";

        StringBuilder builder = null;

        number = 10;

        return variablaDeTipDog;


    }

    public static void dogManagers() {
        List<Dog> dogList = new ArrayList<>();

        Dog dog1 = new Dog("Bichon", 2, "Max");
        Dog dog2 = new Dog("Labrador", 5, "Ben");
        Dog dog3 = new Dog("Chiuaua", 3, "Rex");
        Dog dog4 = addDog();


        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
        dogList.add(dog4);


        for (int i = 0; i < dogList.size(); i++) {
            Dog elemente = dogList.get(i);

            System.out.println(elemente);
        }

    }
}
