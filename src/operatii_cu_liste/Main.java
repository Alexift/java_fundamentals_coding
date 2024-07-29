package operatii_cu_liste;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * 1.sa se defineasca un array de 10 elemente, sa se afiseze acel array in consola.
 * 2.Sa se afiseze array-ul de la coada la inceput.
 * 3.Sa se afiseze toate numerele pare din array.
 * 4.sa se calculeze suma numerelor divizibile cu 3 din array-ul dat.
 * 5.sa se verifice daca numarul 9 este prezent in array , daca este prezent sa se afiseze un mesaj.
 * 6.se citeste de la tastatura un numar intreg n , sa se verifice daca acest nr este prezent in array
 * 7.se citeste de la tastatura un numar intreg n, care va fi dimensiunea unui array, elementele array-ului se vor citi
 * de la tastatura. Sa se afiseze elementele array-uli intr-o singura linie separate prin virgula.
 */

public class Main {
    public static void main(String[] args) {
        int[] numbers = {8, 1, 2, 33, 4, 20, 6, 7, 8, 9};
        //                0,1,2,3, 4,5 ,6,7,8,9
        afisareArray(numbers);

        System.out.println();
        System.out.println("--------------------");

        afisareArrayInversa(numbers);

        System.out.println();
        System.out.println("--------------------");

        afisareNumerePare(numbers);

        System.out.println();
        System.out.println("--------------------");

        afisareSunmaNumereDivizibileCu3(numbers);

        System.out.println();
        System.out.println("--------------------");

        cautareNumarInArray(numbers);

        System.out.println();
        System.out.println("--------------------");

        // citireNumarSiCautareInArray(numbers);

        System.out.println();
        System.out.println("--------------------");

        citireArrayDeLaTastatura();
    }

    public static void afisareArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {

            int element = numbers[i];
            // pentru a afisa elementele invers folosim linia de mai jos
            //  int element = numbers[numbers.length-1-i];
            System.out.print(element + ", ");

        }
    }

    public static void afisareArrayInversa(int[] numbers) {

        for (int i = numbers.length - 1; i >= 0; i--) {
            int element = numbers[i];

            System.out.print(element + ", ");
        }

    }

    public static void afisareNumerePare(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            int element = numbers[i];
            if (element % 2 == 0) {
                System.out.print(element + ", ");
            }
        }
    }

    public static void afisareSunmaNumereDivizibileCu3(int[] numbers) {
        int suma = 0;

        for (int i = 0; i < numbers.length; i++) {
            int element = numbers[i];

            if (element % 3 == 0) {
                suma = suma + element;

            }

        }
        System.out.println(suma);
    }

    public static void cautareNumarInArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 9) {
                System.out.println("numarul 9 a fost gasit");
            }
        }
    }

    public static void citireNumarSiCautareInArray(int[] numbers) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti un numar");

        int n = scanner.nextInt();
        boolean y = false;
        for (int i = 0; i < numbers.length; i++) {
            if (n == numbers[i]) {
                y = true;
                System.out.println("numarul este prezent in array");
                break;
            }

        }
        if (y == false) {
            System.out.println("numarul nu este prezent in array");
        }


        scanner.close();
    }

    public static void citireArrayDeLaTastatura() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("introduceti lungimea array-ului ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            //pentru a adauga un element pe pozitia i in array

            System.out.println("Intruceti un numar");
            numbers[i] = scanner.nextInt();

        }

        afisareArray(numbers);

    }
}
