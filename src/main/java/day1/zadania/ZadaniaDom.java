package day1.zadania;

public class ZadaniaDom {

    public static String divide(int a, int b) {
        if(b == 0) {
            return "Błąd - nie można dzielić przez 0";
        }
        if(a % b == 0) {
            return "" + (a / b);
        }
        return  (a / b) + " " + (a % b) + "/" + b;
    }

    public static void main(String[] args) {
        System.out.println(divide(7, 5));
        System.out.println(divide(10, 5));
        System.out.println(divide(10, 0));
    }
}
