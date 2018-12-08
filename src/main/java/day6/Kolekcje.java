package day6;

import java.util.*;

public class Kolekcje {
    private List<String> lista = new ArrayList<>();

    public Kolekcje() {
        lista.add("Pawel");
        lista.add("Gawel");
        lista.add("Gawel");
        lista.add("Darek");
        lista.add("Jarek");
        lista.add("Ewelina");
        lista.add("Paulina");
    }

    public static void main(String[] args) {
        Kolekcje kolekcje = new Kolekcje();
//        kolekcje.addElement(3, "Dupa");
//        kolekcje.removeElement(5);
//        while (kolekcje.lista.contains("Gawel")) {
//            kolekcje.removeElement("Gawel");
//        }
//        kolekcje.sortElements();
        //kolekcje.test("Ewelina");
        //kolekcje.testList1();
        //kolekcje.testListForEach3();
      //  System.out.println(kolekcje.lista);
      //  kolekcje.createSet();
        //kolekcje.somethingWithSet();
        kolekcje.mapTest2();
    }

    private void somethingWithSet(){

        List<Name> names = new ArrayList<>();
        names.add(new Name(1, "Adam", "Nowak"));
        names.add(new Name(2, "Jan", "Kowalski"));
        names.add(new Name(3, "Anna", "Pilecka"));
        names.add(new Name(4, "Adam", "Nowak"));
        names.add(new Name(5, "Magdalena", "Nowak"));
        for(Name n: names){
            if(n.getId() == 2){
                System.out.println(n);
            }
        }

    }
    private void mapTest() {
        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(1,"Pawel");
        mapa.put(2,"Jan");
        mapa.put(3,"Marek");
        mapa.put(4,"Kasia");
        mapa.put(5,"Marcelina");
        System.out.println(mapa.get(3));
    }

    private void mapTest2(){
        Map<Integer,Name> mapa = new HashMap<>();

        mapa.put(1,new Name(1, "Adam", "Nowak"));
        mapa.put(2,new Name(2, "Jan", "Kowalski"));
        mapa.put(3,new Name(3, "Anna", "Pilecka"));
        mapa.put(4,new Name(4, "Adam", "Nowak"));
        mapa.put(4,new Name(5, "Magdalena", "Nowak"));
        Name name = mapa.get(4);
        System.out.println(name);

    }

    private void createSet(){
        Set<String> randomName = new HashSet<>(lista);
        System.out.println(randomName);
        for (String s: randomName){
            if (s.equals("Gawel")){
                System.out.println("Do dupy");
            }
        }
    }

    private void addElement(int index, String element) {
        lista.add(index, element);

    }

    private void testList1() {
        //System.out.println(lista.get(3));

        for (int i = 0; i < lista.size(); i++) {
            System.out.printf("Element %d wartość %s%s\n", i, lista.get(i), lista.size() - 1 == i ? "" : ",");
        }

    }

    private void testListForEach() {
        for (String element : lista) {
            System.out.printf("Element wartość %s \n", element);

        }
    }

    private void testListForEach2() {           // wyrażenie Lambda
        lista.forEach(System.out::println);
    }

    private void testListForEach3() {           //  inne wyrażenie Lambda (programowanie funkcyjne)
        lista.forEach(x -> System.out.printf("Element wartość %s \n", x));
    }

    private void removeElement(int index) {
        lista.remove(index);

    }

    private void removeElement(String element) {
        lista.remove(element);
    }

    private void sortElements() {
        lista.sort(String::compareTo);
    }

    private void test(String name) {
        char[] a = name.toCharArray();
        Character[] b = new Character[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        List<Character> list = Arrays.asList(b);
        List<Character> copy = new ArrayList<>(list);
        copy.add('a');
//        list.sort(Character::compareTo);
        System.out.println(list);
        System.out.println(copy);
    }
}

