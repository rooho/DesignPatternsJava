package cc.rooho.creational.builder;

/**
 * package : cc.rooho.creational.builder
 * <p>
 * Description :
 *
 * @author Y.J.ZHOU
 * @date 2016.8.1 10:06.
 */
public abstract class PizzaBuilder {
    protected Pizza pizza;

    public Pizza getPizza() { return pizza; }
    public void createNewPizzaProduct() { pizza = new Pizza(); }

    public abstract void buildDough();
    public abstract void buildSauce();
    public abstract void buildTopping();
}
