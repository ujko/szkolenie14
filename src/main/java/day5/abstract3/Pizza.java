package day5.abstract3;

public class Pizza {
    private String name;
    private int size;

    public Pizza(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
