package day3;

import java.util.Random;

public class MathTest {

    public static void main(String[] args) {
        MathTest mathTest = new MathTest();
        mathTest.test();
    }

    private void test() {
        Random zmienna = new Random();
        int s = zmienna.nextInt(900)+100;
        System.out.println(s);
    }
}
