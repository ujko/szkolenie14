package day5.abstract4;

public abstract class Mebel {
    protected String name;
    protected String color;


    @Override
    public String toString() {
        return "Mebel{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
