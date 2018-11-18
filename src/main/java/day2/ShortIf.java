package day2;

public class ShortIf {


    public static void main(String[] args) {
//        method1();
//        int a = 5;
//        bad(a>4?"a":"b");
//        switchTest("");
    }

    private static void test() {
        int a = 6;
        boolean c = a > 10;

        if(c) {
            System.out.println(">");
        }else {
            System.out.println("<");
        }
        System.out.println(a > 10 ? "<": ">");



    }

    private static void method1() {
        int a = 8;
        String res = "";
        if (a > 8) {
            res = "Jest większe od 8";
        } else {
            res = "Jest mniejsze lub równe 8";
        }
        System.out.println("Stary sposób: " + res);
        System.out.println("Nowy sposób: " + (a > 8 ? "Jest większe od 8" : "Jest mniejsze lub równe 8"));
    }

    private static void bad(String a) {
        System.out.println(a.equals("a") ? "Wynik true" : "Wynik false");

    }

    private static boolean check(int a) {
        return a > 8;
    }


    private static void switchTest(String name) {
        if (name == null || name.equals("")) {
            return;
        }
        switch (name) {
            case "dom":
                System.out.println("To jest domek");
                break;
            case "szopa":
                System.out.println("To jest szopa");
                break;
            case "piwnica":
                System.out.println("To jest piwnica");
                break;
            default:
                System.out.println("Metoda default");
        }
    }
}
