package day4.excercises;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class ArrayExtension {

    private int[] tablica;

    private void fillTable() {
        int max = 100;
        Random random = new Random();
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = random.nextInt(max);
        }
    }

    private void write() {
        System.out.println(Arrays.toString(tablica));
    }

    private void tableSize(int size) {
        tablica = new int[size];
    }

    private void addNumber(int index, int liczba) {

        int[] tablica2 = Arrays.copyOf(tablica, tablica.length + 1);

        if (index < tablica2.length) {
            for (int i = 0; i < tablica.length; i++) {
                tablica2[i + ((i < index) ? 0 : 1)] = tablica[i];
            }
            tablica2[index] = liczba;
            tablica = tablica2;
        } else {
            System.out.println("Index nieprawidłowy - tabela nie została zmieniona!");
        }
    }

    private int dataInsert(String message) {
        System.out.println(message);
        Scanner input = new Scanner(System.in);
        int newData = input.nextInt();
        return newData;
    }

    public static void main(String[] args) {

        ArrayExtension arrayTest = new ArrayExtension();
        int c = arrayTest.dataInsert("Nowy rozmiar tablicy: \t");
        arrayTest.tableSize(c);

        arrayTest.fillTable();

        int a = arrayTest.dataInsert("Napisz nr indexu: \t\t");
        int b = arrayTest.dataInsert("Podaj nową wartość: \t");

        System.out.println();
        System.out.print("Stara tabela: \t");
        arrayTest.write();
        arrayTest.addNumber(a, b);
        System.out.print("Nowa tabela: \t");
        arrayTest.write();

    }
}
