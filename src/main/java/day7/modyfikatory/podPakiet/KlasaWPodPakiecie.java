package day7.modyfikatory.podPakiet;

import day7.modyfikatory.Modyfikatory;

public class KlasaWPodPakiecie {
    public static void main(String[] args) {
        Modyfikatory modyfikatory = new Modyfikatory();
//        modyfikatory.zmiennaChroniona = " zmienna chroniona "; // niedostępne w innych pakietach
//        modyfikatory.zmiennaPakietowa = " zmienna pakietowa "; //niedostępne w innych pakietach
        modyfikatory.zmiennaPubliczna = " zmienna publiczna "; //dostępna w innych pakietach
//        System.out.println(modyfikatory.zmiennaChroniona + modyfikatory.zmiennaPakietowa + modyfikatory.zmiennaPubliczna);
        System.out.println(modyfikatory.zmiennaPubliczna);
        System.out.println("w pakiecie mamy dostęp do wszystkich zmiennych oprócz prywatnej");
    }
}
