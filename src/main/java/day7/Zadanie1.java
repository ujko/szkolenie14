package day7;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Zadanie1 {
    public static void main(String[] args) {
//        System.out.println(policz("konstantynopolitańczykowianeczka"));
//        wypiszMape(policz("abba"));
        wypiszMape1(policz("konstrukcja"));
    }

    private static void wypiszMape(Map<Character, Integer> map) { // I metoda iterowania po mapie
        Set<Character> name = map.keySet();
        for (Character c : name) {
            System.out.println("Klucz " + c + " wartość " + map.get(c));
        }
    }

    private static void wypiszMape1(Map<Character, Integer> map) { // II metoda iterowania po mapie

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println("Klucz " + entry.getKey() + " wartość " + entry.getValue());
        }
    }

    private static Map<Character, Integer> policz(String tekst) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < tekst.length(); i++) {
            char s = tekst.charAt(i);
            if (map.get(s) == null) {
                map.put(s, 1);
            } else {
                int liczbaWystapien = map.get(s);
                map.put(s, liczbaWystapien + 1);
            }
        }
        return map;
    }
}
