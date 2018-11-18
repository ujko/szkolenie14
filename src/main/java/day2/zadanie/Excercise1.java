package day2.zadanie;

public class Excercise1 {
    public static void main(String[] args) {
//        System.out.println("Początek programu");
//        System.out.println(divide2(15, 15));
//        System.out.println(divide2(-15, 15));
//        System.out.println(divide2(-5, 15));
//        System.out.println(divide2(-9, 5));
//        System.out.println(divide2(-9, -5));
//        System.out.println(divide2(9, -5));
//        System.out.println(divide2(9, 0));
//        System.out.println(divide1(Integer.MAX_VALUE, Integer.MAX_VALUE));
//        System.out.println(divide2(Integer.MAX_VALUE, Integer.MAX_VALUE));
//
//        System.out.println(divide1(Integer.MIN_VALUE, Integer.MIN_VALUE));
//        System.out.println(divide2(Integer.MIN_VALUE, Integer.MIN_VALUE));
//        System.out.println(divide1(Integer.MAX_VALUE, Integer.MIN_VALUE+1));
//        System.out.println(divide2(Integer.MAX_VALUE, Integer.MIN_VALUE+1));
//
//        System.out.println("Koniec programu");
//        System.out.println(nwd(14,49));
//        System.out.println(nwd1(5, 15)+ " =5");
//        System.out.println(nwd1(6, 9)+ " =3");
//        System.out.println(nwd1(15, 0)+ " =błąd");
        long startNwd = System.currentTimeMillis();
        System.out.println(nwd(Integer.MAX_VALUE, 52));
        long stopNwd = System.currentTimeMillis();
        System.out.println(nwd1(Integer.MAX_VALUE, 52));
        long stopNwd1 = System.currentTimeMillis();

        System.out.println(startNwd);

        System.out.println("Metoda 1: " + (stopNwd-startNwd));
        System.out.println("Metoda 2: " + (stopNwd1-stopNwd));

    }

    public static String divide(int a, int b) {
        String result = "";
        if (b == 0) {
            result = "Błąd - dzielenie przez 0";
        } else {
            int calkowita = a / b;
            int licznik = a % b;

            if (licznik == 0) {
                result = "" + calkowita;
            } else {
                int nwd = nwd(licznik, b);
                result = calkowita + " " + (licznik / nwd) + "/" + (b / nwd);
            }
        }
        return result;
    }

    public static String divide1(int a, int b) {
        boolean znak = true;
        if (a < 0) {
            a *= -1;
            znak = !znak;
        }
        if (b < 0) {
            b *= -1;
            znak = !znak;
        }
        String result = znak ? "" : "-";
        if (b == 0) {
            result = "Błąd - dzielenie przez 0";
        } else {
            int calkowita = a / b;
            int licznik = a % b;
            if (licznik == 0) {
                result += "" + calkowita;
            } else {
                result += calkowita != 0 ? calkowita + " ": "";
                int nwd = nwd(licznik, b);
                result +=  (licznik / nwd) + "/" + (b / nwd);
            }
        }
        return result;
    }

    public static String divide2(int a, int b) {
        String result = "";
        if (a*b<0){
            result = "-";
        }
        a= Math.abs(a);
        b= Math.abs(b);

        if (b == 0) {
            result = "Błąd - dzielenie przez 0";
        } else {
            int calkowita = a / b;
            int licznik = a % b;
            if (licznik == 0) {
                result += "" + calkowita;
            } else {
                result += calkowita != 0 ? calkowita + " ": "";
                int nwd = nwd(licznik, b);
                result +=  (licznik / nwd) + "/" + (b / nwd);
            }
        }
        return result;
    }


    private static int nwd(int a, int b) {
        while (a != b) {
            if(a == 1 || b == 1) {
                return 1;
            }
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    private static int nwd1(int a, int b) {
        if (b==0){
            System.out.println("Pamietaj cholero nie dziel przez zero");
            return -1;
        }
        int c;
        while (true) {
            c = a%b;
            if(c==0) {
                return b;
            }
            a = b;
            b = c;
        }
    }

    public boolean ttt(String s) {
        return s.equals("Dom");
    }
}
