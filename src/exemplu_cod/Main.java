package com.sda;

// {} => semnifica un bloc de cod / set de instructiuni / delimiteaza codul scris de noi

// In java putem scrie cod DOAR IN INTERIORUL ACOLADELOR

// Clasa => Bloc de apartamente
// Metoda => etajul din bloc
// if => un apartament
// for => o camera din apartament

public class BlocApartamente { // bloc de apartamente
    // variabila globala
    String administrator = "";

    public static void etajul1() { // etajul 1
        //variabile locale in metoda
        String ghiveciFlori = "Petunie";

        boolean isTrue = true;

        if(isTrue == true) { // apartament
            String aparatClima = "Boch";

            int lines = 10;

            System.out.println(isTrue);
            System.out.println(lines);

            for(int i = 0; i < 10; i++) { // camera
                // i este vizibil doar in una camere
                System.out.println(i);

                String laptop = "MacBook";

                System.out.println(aparatClima);

                System.out.println(isTrue);
            }
        }

        if(1 > 0) {
            System.out.println("da unu e mai mare ca 0");
        }

        System.out.println("Este in if?");

//        System.out.println(aparatClima);

        System.out.println(isTrue);
    }

    public static void etajul2(String message) { // etajul 2

    }


}