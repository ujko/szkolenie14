package day3;

import java.io.Serializable;

public class Car implements Serializable{

    private String name;
    private String color;
    private int horsePower;

    public Car(String name, String color, int horsePower) {
        this.name = name;
        this.color = color;
        this.horsePower = horsePower;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public String getColor() {
        return color;
    }

//    public void setColor(String color) {
//        this.color = color;
//    }

    public int getHorsePower() {
        return horsePower;
    }

//    public void setHorsePower(int horsePower) {
//        this.horsePower = horsePower;
//    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", horsePower=" + horsePower +
                '}';
    }
}
