package day1;

public class StringTest {

    public static void main(String[] args) {
        String a = "Dom";
        String b = "Dom";
        String c = new String("Dom");

        System.out.println("a == b " + (a == b));
        System.out.println("a == c " + (a == c));

        System.out.println("a.equals(b)" + (a.equals(b)));
        System.out.println("a.equals(c)" + (a.equals(c)));

        String d = "Ala ma ";
        String e = "kota";
        String f = d + e;
        System.out.println(f);

        String h = "Kot ma ";
        h = h + "Alę";
        System.out.println(h);
    }
}
