package day5.Dziedziczenie;

public class Jakkolwiek {

    public Jakkolwiek() {
        System.out.println("Konstruktor klasy");
    }


    {
        System.out.println("Pole dynamic");
    }



    public static void main(String[] args) {
        new Jakkolwiek();
    }

    static {
        System.out.println("Pole Static");
    }

}
