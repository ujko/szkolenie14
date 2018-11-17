package day2.std;

public class DynamicStatic {

    public DynamicStatic() {
        System.out.println("Konstruktor klasy DynamicStatic");
    }

    public static void main(String[] args) {
        DynamicStatic dynamicStatic = new DynamicStatic();
//        dynamicStatic.dynamicRun();
//        dynamicStatic.staticRun();
        dynamicStatic.dynamicRun2();
    }

    public void dynamicRun() {
        Pizza funghi = new Pizza();
        Pizza margerita = new Pizza();
        funghi.setName("funghi");
        margerita.setName("margerita");

        System.out.println(funghi.getName());
        System.out.println(margerita.getName());
    }

    public void staticRun() {
        Pizza.staticName = "funghi";
        Pizza.staticName = "margerita";
        System.out.println(Pizza.staticName);
    }

    public void dynamicRun2() {
        Pizza funghi = new Pizza("Pizza margerita");
        System.out.println(funghi.getName());
    }
}
