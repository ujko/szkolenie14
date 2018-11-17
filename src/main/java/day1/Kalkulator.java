package day1;

public class Kalkulator {

    public static double oblicz(int a, int b, String znak) {
        if(znak.equals("+")) {
            return a + b;
        } else if(znak.equals("-")) {
            return a - b;
        } else if(znak.equals("/")) {
            return (double)a/b;
        } else if(znak.equals("*")) {
            return a * b;
        } else {
            System.out.println("Nieprawidłowy znak");
            return 0.0;
        }
    }

    public static double oblicz1(int a, int b, String znak) {
        double result = 0.0;
        if(znak.equals("+")) {
            result = a + b;
        } else if(znak.equals("-")) {
            result = a - b;
        } else if(znak.equals("/")) {
            result = (double)a/b;
        } else if(znak.equals("*")) {
            result = a * b;
        } else {
            System.out.println("Nieprawidłowy znak");
        }
        return result;
    }

    public static double oblicz2(int a, int b, String znak) {
        double result = 0.0;
        switch (znak){
            case "+":
                result = a + b;
                System.out.println("dodawanie " + result);
                break;
            case "-":
                result = a - b;
                System.out.println("odejmownie " + result);
                break;
            case "/":
                result = (double)a/b;
                System.out.println("divide " + result);
                break;
            case "*":
                result = a * b;
                System.out.println("mnożenie " + result);
                break;
            default:
                System.out.println("Nieprawidłowy znak");
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(oblicz(4,3,"+"));
        System.out.println(oblicz(4,3,"-"));
        System.out.println(oblicz(4,3,"/"));
        System.out.println(oblicz(4,3,"*"));
        System.out.println(oblicz(4,3,"d"));
        System.out.println("*************************");
        System.out.println(oblicz1(4,3,"+"));
        System.out.println(oblicz1(4,3,"-"));
        System.out.println(oblicz1(4,3,"/"));
        System.out.println(oblicz1(4,3,"*"));
        System.out.println(oblicz1(4,3,"d"));
        System.out.println("*************************");
        System.out.println(oblicz2(4,3,"+"));
        System.out.println(oblicz2(4,3,"-"));
        System.out.println(oblicz2(4,3,"/"));
        System.out.println(oblicz2(4,3,"*"));
        System.out.println(oblicz2(4,3,"d"));
    }

}
