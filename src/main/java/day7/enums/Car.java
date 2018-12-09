package day7.enums;

public enum Car {
    BMW("Bardo Mały Wóz"),
    JAGUAR("520"),
    AUDI("A3"),
    OPEL("Astra"),
    MITSUBISHI("Lancer");

    private String name;

    private String tekst;

    public String getTekst() {
        return tekst;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }

    public String getName() {
        return name;
    }

    public void wypisz() {
        System.out.println("Wybrany przez ciebie samochod " + name);
    }

    Car(String name) {
        this.name = name;
    }
}
