package day2.zadanie;

public class Excercise1 {
    public static void main(String[] args) {
        System.out.println("Początek programu");
        System.out.println(divide(15,15));
        System.out.println("Koniec programu");
//        System.out.println(nwd(14,49));
    }

    public static String divide(int a, int b) {
        String result = "";
        if (b == 0) {
            result = "Błąd - dzielenie przez 0";
        } else {
            int calkowita = a / b;
            int licznik = a % b;

            if(licznik == 0) {
                result = "" + calkowita;
            } else {
                int nwd = nwd(licznik, b);
                result = calkowita + " " + (licznik/nwd) + "/" + (b/nwd);
            }
        }
        return result;
    }

    private static int nwd(int a, int b) {
        while (a!=b){
            if(a>b){
                a -= b;
            }else {
                b -= a;
            }
        }
        return a;
    }

}
