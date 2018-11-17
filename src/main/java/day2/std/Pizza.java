package day2.std;

public class Pizza {
    public static String staticName;

    private String name;
    private int size;

    public Pizza() {
    }

    public Pizza(String name) {
        this.name = name;
    }

    public Pizza(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
