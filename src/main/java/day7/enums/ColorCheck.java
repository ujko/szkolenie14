package day7.enums;

import day5.abstract2.BMW;

public class ColorCheck {
    public static void main(String[] args) {
        ColorCheck colorCheck= new ColorCheck();
//        System.out.println(colorCheck.colorCheck(Kolor.BLACK));


//        Kolor kolor = Kolor.BLACK;
//        colorCheck.colorCheck2(kolor);
        Car car = Car.BMW;

        colorCheck.carCheck(car);
        car.setTekst("tekst z obiektu car");
        Car car2 = Car.BMW;
        System.out.println(car2.getTekst());
        System.out.println(car == car2);
        car2.setTekst("inny tekst");
        System.out.println(car.getTekst());
    }

    public void carCheck(Car car) {
        System.out.println(car.getName());
        car.wypisz();
    }

    public void singleColorCheck(KolorSingle kolorSingle){
        KolorSingle kolorSingle1 = KolorSingle.GREEN;


    }



    public String colorCheck(Kolor kolor){
        if(kolor == Kolor.RED){
            return "kolor czerwony";
        }
        return "nie czerwony";
    }
    public void colorCheck2(Kolor kolor){
        switch (kolor){
            case RED:
                System.out.println("kolor czerwony");
                break;
            case BLACK:
                System.out.println("kolor czarny");
                break;
            case BLUE:
                System.out.println("kolor niebieskie");
                break;
            case CYAN:
                System.out.println("kolor cyjan");
                break;
            case GREEN:
                System.out.println("kolor zielony");
                break;
        }

    }
}
