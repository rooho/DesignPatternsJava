package cc.rooho.creational.builder;

/**
 * package : cc.rooho.creational.builder
 * <p>
 * Description :
 *
 * @author Y.J.ZHOU
 * @date 2016.8.1 10:08.
 */
public class BuilderExample {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        PizzaBuilder hawaiian_pizzabuilder = new HawaiianPizzaBuilder();
        PizzaBuilder spicy_pizzabuilder = new SpicyPizzaBuilder();

        waiter.setPizzaBuilder( hawaiian_pizzabuilder );
        waiter.constructPizza();

        Pizza pizza = waiter.getPizza();
    }
}
