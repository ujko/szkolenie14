package day6.powtorki;

public class Car extends Pojazd{

    public Car(String name){
        super("Przekazany parametr " + name);
        System.out.println("Konstruktor Car 1");
        System.out.println(name);

    }

    public Car(String name, String color){
        super("Przekazany parametr " + name);
        System.out.println("Konstruktor Car 2");
        System.out.println(name);
        System.out.println(color);
    }
}
