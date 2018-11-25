package day5.abstract3;

public class Main {
    public static void main(String[] args) {
        PizzaDAO pizzaDAO = new PizzaDAOMem();
        pizzaDAO.addPizza(new Pizza("margarita", 23));
        System.out.println(pizzaDAO.getPizza());

    }
}
