package day5.abstract2;

public class Main {
    public static void main(String[] args) {
        Car car = new M3();
        car.setName("i8");
        car.writeSomething();
        car.setText();
        System.out.println(car.getName());
    }
}
