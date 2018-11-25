package day5.abstract5;

public class Teacher implements Person {
    private String name = "nauczyciel";

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                '}';
    }
}
