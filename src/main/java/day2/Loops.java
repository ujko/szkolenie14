package day2;

public class Loops {
    public static void main(String[] args) {
        method6();
    }

    public static void method1() {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + ", ");
        }
    }

    public static void method2() {
        String a = "Ala ma kota a kot ma ale";
        String[] tab = a.split(" ");

        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + ", ");

        }
    }

    public static void method3() {
        int i = 0;//1 argument
        for (; ; ) {
            System.out.print(i + ", ");
            if (i == 8) {  //2 argument
                break;
            }
            i++; //3 argument inkrementacja
        }
    }

    public static void method4() {
        for (int i = 8; i > 0; i--) {
            System.out.print(i + ", ");
        }
    }

    public static void method5() {
        int a = 3;
        while (a < 8) {
            System.out.print(a + ", ");
            a++;
        }
        System.out.println();
        System.out.println("Koniec pętli");
    }

    public static void method6() {
        int a = 9;
        do {
            System.out.print(a + ", ");
            a++;
        } while (a < 8);
        System.out.println();
        System.out.println("Koniec pętli");
    }

    public static void pytanie() {
        int a = 5;
        System.out.println("a = " + a++);  //5
        System.out.println(a);
        System.out.println("a = " + ++a);  //7
        System.out.println(a);
        System.out.println("a = " + a--);  //7
        System.out.println(a);
        System.out.println("a = " + --a);  //5
        System.out.println(a);
        String dom = "House";
        dom += " of the rising sun";

    }

}
