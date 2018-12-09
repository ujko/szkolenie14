package day7.modyfikatory.podPakiet;

import day7.modyfikatory.Modyfikatory;

public class KlasaDziedziczacaWPodPakiecie  extends Modyfikatory {

public void metodaDynamiczna(){
    zmiennaChroniona = " zmienna chroniona ";  //dostepna po dziedziczeniu
//    zmiennaPakietowa = " zmienna pakietowa "; //niedostępna działa tylko w pakiecie, z reguły korzysta sie do testów
    zmiennaPubliczna = " zmienna publiczna ";
    System.out.println(zmiennaChroniona + zmiennaPubliczna);
    System.out.println("w pakiecie mamy dostęp do wszystkich zmiennych oprócz prywatnej");
}

 }
