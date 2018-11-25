package utils;

import day3.Car;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //Utils.writeTextToFile("Ala.txt", "Ala ma kota");
        //String tekst = Utils.readTextFromFile2("Ala.txt");
       // System.out.println(tekst);
        //Car car = new Car("BMW", "yellow", 500);
        //Utils.writeObject("Car.dat", car);
        Car bmw = (Car) Utils.readObject("Car.dat");
        System.out.println(bmw);
    }
}
