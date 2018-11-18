package day3;

import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {
        System.out.print(new ScannerTest().get());
    }

    private String get() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Napisz swoje imie: ");
        String res = scanner.nextLine();
        System.out.print("Podaj wiek: ");
        int age = scanner.nextInt();
        return "Witaj " + res + " wiek: " + age;
    }
}
