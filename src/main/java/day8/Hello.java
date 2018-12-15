package day8;

public class Hello {

    public Hello() {
        System.out.println("Konstruktor");
    }
    {
        System.out.println("Komunikat");
    }
    static{
        System.out.println("Pole statyczne");
    }








    private static final String MESSAGE = "musza byc 2 argumenty";

    public static void main(String[] args) {
        Hello hello = new Hello();
        int pierwszy = 0;
        int drugi = 0;
        try {
            pierwszy = Integer.parseInt(args[0]);
            drugi = Integer.parseInt(args[1]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println(MESSAGE);
        } catch(NumberFormatException e) {
            System.out.println("argumentami maja byc liczby");
        }


        String wynik = hello.dodaj(pierwszy , drugi);
        System.out.println(wynik);
        String wynik1 = hello.dodaj("pierwszy " , "drugi");
        System.out.println(wynik1);
    }
//    public  String dodaj(int a, int b){
//        return a + b + "";
//    }
    public  String dodaj(String a, String b) {
        return a + b + "";
    }

    public  String dodaj(double a, double b){
        return a + b + "";
    }
}
