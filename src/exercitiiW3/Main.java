package exercitiiW3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Double valoare = 0.0;
        int contor = 0;
        int contor2 = 1;

        System.out.println("Lungimea sirurilor de numere");
        int n = in.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("introduceti valoarea cu nr " + contor2);
            array[i] = in.nextInt();
            contor++;
            contor2++;
            valoare = valoare + array[i];


        }
        System.out.println("media este de :");
        System.out.println(valoare / contor);

        in.close();



    }


}
