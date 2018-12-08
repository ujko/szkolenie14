package day6.exercises;

public class Exercise1 {

    public static void main(String[] args) {
        // System.out.println(dodaj(5, 10));
        palindrom3("oKo w Oko");
        palindrom3("kajak");
        palindrom3("Aibofobia");
        palindrom3("KobyŁa ma maŁy BoK");
        palindrom3("dupa");
        palindrom3("szkolenie");
    }

    private static int dodaj(int a, int b) {
        //return Integer.sum(a, b);
        while (b-- > 0) {
            a++;
        }
        return a;
    }

    private static void palindrom(String tekst) {
        tekst = tekst.toLowerCase();
        tekst = tekst.replaceAll(" ", "");

        char[] tablica = tekst.toCharArray();
        int dlugosc = tekst.length();
        for (int i = 0; i < dlugosc/2; i++) {
            if (tablica[i] != tablica[dlugosc - i - 1]) {
                System.out.println("Nie jest palindromem !");
                return;
            }

        }
        System.out.println("Jest Palindromem.");
    }

    private static void palindrom2(String tekst){
        tekst = tekst.toLowerCase();
        tekst = tekst.replaceAll(" ", "");

        char[] tablica = tekst.toCharArray();
        int last = tekst.length()-1;
        int first = 0;
        while(last > first){
            if(tablica[last--] != tablica[first++]){
                System.out.println("Nie jest palindromem !");
                return;
            }
        }
        System.out.println("Jest palindromem.");
    }

    private static void palindrom3(String tekst){
        tekst = tekst.replaceAll(" ", "");
        StringBuilder stringBuilder = new StringBuilder(tekst);
        String result = stringBuilder.reverse().toString();
        if(tekst.equalsIgnoreCase(result)){
            System.out.println("Jest palindromem.");
        }
        else System.out.println("nie jest plaindromem.");

    }


}
