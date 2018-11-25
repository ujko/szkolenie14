package day5.abstract4;

public class StolDAO implements MebelDAO {
    @Override
    public void addMebel(Mebel mebel) {
        System.out.println("Mebel ze stolDAO " + mebel);
    }

    @Override
    public Mebel getMebel() {
        return new Stol();
    }
}
