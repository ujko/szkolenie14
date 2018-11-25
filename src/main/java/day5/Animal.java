package day5;

import java.io.Serializable;

public class Animal implements Serializable {
   private String kolor;
   private String rodzaj;
   private String imie;



    public Animal(String kolor, String rodzaj, String imie) {
        this.kolor = kolor;
        this.rodzaj = rodzaj;
        this.imie = imie;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "kolor='" + kolor + '\'' +
                ", rodzaj='" + rodzaj + '\'' +
                ", imie='" + imie + '\'' +
                '}';
    }

}
