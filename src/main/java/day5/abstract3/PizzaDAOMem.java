package day5.abstract3;

public class PizzaDAOMem implements PizzaDAO{
    @Override
    public void addPizza(Pizza pizza) {
        System.out.println("dodano pizze do pamieci " + pizza);
    }

    @Override
    public Pizza getPizza() {
        return new Pizza("pizza z pamieci", 33);
    }
}
