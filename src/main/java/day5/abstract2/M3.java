package day5.abstract2;

public class M3 extends BMW {
    @Override
    public void setName(String name) {
        super.setName("M3 " + name);
    }
    public void setText() {
        System.out.println("tekst z m3");
    }
}
