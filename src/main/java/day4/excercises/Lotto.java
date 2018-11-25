package day4.excercises;

import java.util.Arrays;
import java.util.Random;

public class Lotto {
    private int[] tabela;
    private int range;

    public Lotto(int quantityOfNumbers, int range) {
        if (range<quantityOfNumbers){
            throw new IllegalArgumentException("Liczba range musi być > quantityOfNumbers");
        }
        this.range = range;
        tabela = new int[quantityOfNumbers];
    }

    private void losowanie() {
        Random random = new Random();
        for (int i = 0; i < tabela.length; i++) {
            int a = random.nextInt(range) + 1;
            if (checkExist(a)) {
                i--;
            } else {
                tabela[i] = a;
            }
        }
    }

    private boolean checkExist(int a) {
            for (int b : tabela) {
                if (b == a) {
                    System.out.println("powtorzona cyfra " + a);
                    return true;
                }
            }
            return false;
    }

    public static void main(String[] args) {
        try {
            Lotto wynik = new Lotto(10, 80);
            wynik.losowanie();
            Arrays.sort(wynik.tabela);
            System.out.println(Arrays.toString(wynik.tabela));
        }catch (IllegalArgumentException e){
            System.out.println("Podałeś  błędne parametry");
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Sekcja finally");
        }
    }
}
