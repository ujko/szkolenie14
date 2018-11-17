package day1;

public class Zmienne {
    public static final int DRUGA_ZMIENNA = 4;

    public static void main(String[] args) {
        method4();
    }

    public static void method1() {
        boolean booleanTrue = Boolean.TRUE;
        boolean booleanFalse = Boolean.FALSE;
        byte byteMin = Byte.MIN_VALUE;
        byte byteMax = Byte.MAX_VALUE;
        short shortMin = Short.MIN_VALUE;
        short shortMax = Short.MAX_VALUE;
        int intMin = Integer.MIN_VALUE;
        int intMax = Integer.MAX_VALUE;
        long longMin = Long.MIN_VALUE;
        long longMax = Long.MAX_VALUE;
        float floatMin = Float.MIN_VALUE;
        float floatMax = Float.MAX_VALUE;
        double doubleMin = Double.MIN_VALUE;
        double doubleMax = Double.MAX_VALUE;
        char charMin = Character.MIN_VALUE;
        char charMax = Character.MAX_VALUE;


        System.out.println("booleanTrue: " + booleanTrue);
        System.out.println("booleanFalse: " + booleanFalse);
        System.out.println("byteMin: " + byteMin);
        System.out.println("byteMax: " + byteMax);
        System.out.println("shortMin: " + shortMin);
        System.out.println("shortMax: " + shortMax);
        System.out.println("intMin: " + intMin);
        System.out.println("intMax: " + intMax);
        System.out.println("longMin: " + longMin);
        System.out.println("longMax: " + longMax);
        System.out.println("floatMin: " + floatMin);
        System.out.println("floatMax: " + floatMax);
        System.out.println("doubleMin: " + doubleMin);
        System.out.println("doubleMax: " + doubleMax);
        System.out.println("charMin: " + charMin);
        System.out.println("charMax: " + charMax);

    }

    public static void method2() {
        short a = 123;
        int b = a;

        int c = 1233333555;
        short d = (short) c;
        System.out.println(d);

        long i = 92_233_720_368_547L;

        double e = 12d;
        float ff = 12.0f;

        int gggg = 1_000_000;

        System.out.println(gggg);
    }

    public static void method3() {
        int a = 7;
        int b = 5;

        System.out.println(a == b);
        System.out.println(a <= b);
        System.out.println(a >= b);
        System.out.println(a != b);
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println((double) a / b);
        System.out.println(a % b);

    }

    public static void method4() {
        int a = 7;
        int b = a;

        b = b + 5;

        System.out.println(a);
        System.out.println(b);
    }

}
