package afisare_operatii_numere;

/**
 * 1. Sa se afiseze toate numerele impare de la 0 la 50
 * 2. Sa se calculeze sunma primelor 5 numere divizibile cu 3 si cu 5.
 * 3. Sa se calculeze prodsului primelor 50 numere divizibile cu 9
 */
public class Main {
    public static void main(String[] args) {
        afisareNumereImpare();
        System.out.println("exercitiul 2.");
        afisareNumereDivizibileCu3si5();
        System.out.println("exercitiul 3.");
        produsulNumerelorDivizibileCu9();

    }

    public static void afisareNumereImpare() {
        for (int i = 0; i <= 50; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }


        }

    }

    public static void afisareNumereDivizibileCu3si5() {
        int i = 1;//i ne ajuta sa luam toate numerele de la 1 la infinit
        int contor = 0; // contor ne ajuta sa tinem evidenta numerelor gasite ce indeplinesc conditia
        int suma = 0; //suma ne ajuta sa calculam suma numerelor gasite

        while (contor < 5) { // Se executa cat timp variabila contor este mai mica ca 5

            if (i % 3 == 0 && i % 5 == 0) {// Verificam daca numarul i se imaprte exact la 3 si la 5
                System.out.println(i);
                suma = suma += i;// Daca este indeplinita conditia, adunam numarul gasit la suma existenta
                contor++; // se incrementeaza atunci cand gasim numarul ce indeplineste conditia
            }
            i++;// i-ul se incrementeaza indiferent daca conditia este indeplinita sau nu
        }
        System.out.println(suma); // Afisam suma numerelor gasite
    }

    public static void produsulNumerelorDivizibileCu9() {
        int i = 1;
        int contor = 0;
        long produsul = 1;

        while (contor < 50) {
            if (i % 9 == 0) {
                produsul = produsul * i;
                contor++;
            }
            i++;
        }
        System.out.println(produsul);
    }
}

