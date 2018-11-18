package day3;

import java.util.Arrays;
import java.util.Random;

public class ArrayTest {
    private int[] tablica = new int[10];

    private void fillTable() {
        int max = 1000;
        Random random = new Random();
        for(int i = 0; i < tablica.length; i++) {
            tablica[i] = random.nextInt(max);
        }
    }

    private void write() {
//        for(int i = 0; i < tablica.length; i++) {
//            System.out.print(tablica[i] + ", ");
//        }
//        System.out.println();
        System.out.println(Arrays.toString(tablica));
    }
    public void addNumber(int a) {
//        int[] tablica2 = new int[tablica.length+1];
//        for(int i =0; i< tablica.length; i++) {
//            tablica2[i] = tablica[i];
//
//        }
        int[] tablica2 = Arrays.copyOf(tablica, tablica.length + 1);
        tablica2[tablica2.length-1] = a;
        tablica = tablica2;
    }

    public void addNumber(int index, int liczba) {
        //TODO: napisać metodę dodającą liczbę pod podanym indeksem
    }




    public static void main(String[] args) {
        ArrayTest arrayTest = new ArrayTest();
        arrayTest.fillTable();
        arrayTest.write();
        arrayTest.addNumber(88);
        arrayTest.write();
        Arrays.sort(arrayTest.tablica);
        arrayTest.write();

    }
}
