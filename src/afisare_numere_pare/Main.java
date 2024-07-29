package afisare_numere_pare;

/**
 * sa se afisee toate numerele pare de la 0 pana la 100
 */
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }
    }
}
