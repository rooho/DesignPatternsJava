package cc.rooho.creational.builder;

/**
 * package : cc.rooho.creational.builder
 * <p>
 * Description :
 *
 * @author Y.J.ZHOU
 * @date 2016.8.1 10:08.
 */
public class Waiter {
    private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder pb) { pizzaBuilder = pb; }
    public Pizza getPizza() { return pizzaBuilder.getPizza(); }

    public void constructPizza() {
        pizzaBuilder.createNewPizzaProduct();
        pizzaBuilder.buildDough();
        pizzaBuilder.buildSauce();
        pizzaBuilder.buildTopping();
    }
}
