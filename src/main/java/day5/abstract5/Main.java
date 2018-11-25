package day5.abstract5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[2];
        people[0] = new Teacher();
        people[1] = new CareTaker();
        System.out.println(Arrays.toString(people));
    }
}
