package day6.exercises;

import java.util.*;

public class Lotto {

    private Set<Integer> losuj(int ileLiczb, int zIluLiczb){
        Random r = new Random();
        Set<Integer> liczby = new TreeSet<>();
        while(liczby.size() < ileLiczb){
            liczby.add(r.nextInt(zIluLiczb) + 1);
        }
        System.out.println(liczby);
        return liczby;
    }

    private int checkNumbers(Set<Integer> setOfUserNumbers, Set<Integer> randomNumbers){
        int i = 0;
        for(Integer a: setOfUserNumbers){
            if(randomNumbers.contains(a)){
                i++;
            }
        }
        return i;
    }

    private  String wypiszLiczbe(int liczba){
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "liczb");
        map.put(1, "liczbę");
        map.put(2, "liczby");
        map.put(3, "liczby");
        map.put(4, "liczby");
        map.put(5, "liczb");
        map.put(6, "liczb");
        return map.get(liczba);
    }

    public static void main(String[] args) {
        Lotto lotto = new Lotto();
        //System.out.println(lotto.losuj(6, 49));
        Set<Integer> userSet = new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        int i = lotto.checkNumbers(userSet, lotto.losuj(6, 49));

        System.out.printf("Trafiles %d %s", i, lotto.wypiszLiczbe(i));
    }
}
