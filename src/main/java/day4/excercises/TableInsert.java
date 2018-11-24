package day4.excercises;

import java.util.Arrays;

public class TableInsert {
    private int[] tablica = {1, 2, 3, 4, 5};

    private int[][] tablicaDwuwymiarowa = {{1, 2, 3, 7, 8, 9}, {4, 5, 6}, {7, 8, 9, 10, 11},{0}};

    private void insert(int index, int value) {
        int[] copy = new int[tablica.length + 1];

        for (int i = 0, j = 0; i < copy.length; i++, j++) {
            if (i == index) {
                copy[i] = value;
                i++;
            }
            copy[i] = tablica[j];
        }
        tablica = copy;
    }

    private void insert2(int index, int value) {
        int[] copy = Arrays.copyOf(tablica, tablica.length+1);

        for ( int i = copy.length-1; i > index; i--){
            copy [i] = copy[i-1];
        }
        copy[index] = value;
        tablica = copy;
    }

    private void insert1(int index, int value) {
        int[] copy = new int[tablica.length + 1];

        for (int i = 0; i < tablica.length; i++) {
            copy[i + ((i<index)? 0:1)] = tablica[i];
        }
        copy[index] = value;
        tablica = copy;
    }

    private void metodaPrzyjmujacaWieleArgumentowInt(int...a) {
        for(int b : a) {
            System.out.println(b);
        }
    }

    private void wypisztablicewielowymiarowa(){
        for(int i =0; i < tablicaDwuwymiarowa.length;i++){
            for(int j = 0; j < tablicaDwuwymiarowa[i].length; j++){
                System.out.print(tablicaDwuwymiarowa[i][j]+", ");
            }
            System.out.println();

            }
    }

    private void  krotkieFory() {
        for(int a[]: tablicaDwuwymiarowa) {
            for(int b: a) {
                System.out.print(b + ", ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        TableInsert tableInsert = new TableInsert();
//        tableInsert.wypisztablicewielowymiarowa();
//        tableInsert.krotkieFory();
//        tableInsert.metodaPrzyjmujacaWieleArgumentowInt(1,6,6,4,3,2,34);
        System.out.println(Arrays.toString(tableInsert.tablica));
        tableInsert.insert2(2,88);
        System.out.println(Arrays.toString(tableInsert.tablica));
}
}
