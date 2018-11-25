package day5.abstract4;

import java.util.Arrays;

public class Main  {
    public static void main(String[] args) {
        MebelDAO mebelDAO = new StolDAO();
        mebelDAO.addMebel(new Stol());
        System.out.println(mebelDAO.getMebel());
        Mebel[] mebels = new Mebel[3];
        mebels[0] = new Stol();
        mebels[1] = new Krzeslo();
        System.out.println(Arrays.toString(mebels));
    }
}
