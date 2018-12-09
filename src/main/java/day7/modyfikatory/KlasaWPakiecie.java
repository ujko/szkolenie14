package day7.modyfikatory;

public class KlasaWPakiecie  {
    public static void main(String[] args) {
        Modyfikatory modyfikatory = new Modyfikatory();
        modyfikatory.zmiennaChroniona = " zmienna chroniona ";
        modyfikatory.zmiennaPakietowa = " zmienna pakietowa ";
        modyfikatory.zmiennaPubliczna = " zmienna publiczna ";
        System.out.println(modyfikatory.zmiennaChroniona + modyfikatory.zmiennaPakietowa + modyfikatory.zmiennaPubliczna);
        System.out.println("w pakiecie mamy dostęp do wszystkich zmiennych oprócz prywatnej");
    }
}
