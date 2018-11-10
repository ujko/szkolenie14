package day1;

public class Metody {

    public static void metoda1(){
        System.out.println("Printout z metody 1");
    }

    public static void metoda2(String name) {
        System.out.println("Name z metody 2 " + name);
    }

    public static void metoda3(int a, int b) {
        System.out.println("Wynik: " + (a + b));
    }

    public static int metoda4(int a, int b) {
        int res = a + b;
        return res;
    }

    public static void main(String[] args) {
        metoda1();
        metoda2("Paweł");
        metoda3(4,7);

        int result = metoda4(5,4);
        System.out.println("Inne dodawanie " + result);
    }
}
