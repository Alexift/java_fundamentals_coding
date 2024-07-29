package obiecte_clase;

public class Dog {
    // Propietati:
    String rasa;
    int varsta;
    String nume;

    //Constructori

    public Dog() {
        // Constuctor default
        // Acest constructor se genereaza automat si nu este vizibil in cod
        // Atunci cand generam un constructor Constructorul default DISPARE
        // daca avem un constructor definit , putem defini in mod explicit constructorul default

    }

    public Dog(String rasa, int varsta, String nume) {
        // Constructor cu paramertrii

        this.rasa = rasa;
        this.varsta = varsta;
        this.nume = nume;

    }

    //metode
    public String toString() {
        //Metoda toString (transforma obiectul nostru intr-un text)
        //Atunci cand dorim sa afisam un obiect folosind System.out.println metoda toString se apeleaza automat
        return "rasa: " + this.rasa + " ,varta: " + this.varsta + " ,nume: " + this.nume;
    }

    public boolean equals(Object o) {
        Dog obj = (Dog) o; // cast de la Object la Dog
        if (this.nume.equals(obj.nume) && this.rasa.equals(obj.rasa) && this.varsta == obj.varsta) {
            return true;
        } else {
            return false;

        }


//        if (this.nume.equals(((dog)o).nume)){
//            return true;
//        }else {
//            return false;
//        }
    }
}
