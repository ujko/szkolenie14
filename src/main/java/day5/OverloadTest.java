package day5;

import java.util.Arrays;

public class OverloadTest {
    public static void main(String[] args) {
        OverloadTest overloadTest = new OverloadTest();
        overloadTest.test();
        overloadTest.test(20);
        overloadTest.test("dupa");
        //ovveride nadpisywanie klasy
        //ovverload - metoda, ktora przyjmuje rozne parametry wejsciowe
    }

    private  void test() {
        System.out.println("pusta metoda test");
    }

    private  void test(String message) {
        System.out.println("metoda string test " + message);
    }
    private  void test(int age) {
        System.out.println("metoda int test  " + age);
    }




}
