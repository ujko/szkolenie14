package day5.abstract1;

public class Main {
    public static void main(String[] args) {
    SchoolWorker teacher = new CareTaker(1,"Marysia");
    teacher.addWorker(teacher);
    }
}
