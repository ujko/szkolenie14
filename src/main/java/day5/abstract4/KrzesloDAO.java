package day5.abstract4;

public class KrzesloDAO implements MebelDAO {
    @Override
    public void addMebel(Mebel mebel) {
        System.out.println("KrzesłoDAO " + mebel);
    }

    @Override
    public Mebel getMebel() {
        return new Krzeslo();
    }
}
