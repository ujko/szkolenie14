package day2;



public class StringTest {


    public static void main(String[] args) {
        method2();
    }

    private static void method1(String a) {
        String b = "";
        System.out.println(b.equals(a));
    }

    private static void method2() {
        String a = "Ala ma kota";
        String[] tab = a.split(" ");

        System.out.println(tab[0]);
        System.out.println(tab[1]);
        System.out.println(tab[2]);
    }

}
