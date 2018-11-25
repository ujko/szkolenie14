package day5.abstract3;

public class PizzaDAODB implements PizzaDAO {
    @Override
    public void addPizza(Pizza pizza) {
        System.out.println("dodano pizze do bazy danych DB \n" + pizza);
    }

    @Override
    public Pizza getPizza() {
        return new Pizza("pizza z DB", 40);
    }
}
