package cc.rooho.creational.builder;

/**
 * package : cc.rooho.creational.builder
 * <p>
 * Description :
 *
 * @author Y.J.ZHOU
 * @date 2016.8.1 10:08.
 */
public class SpicyPizzaBuilder extends PizzaBuilder {
    public void buildDough()   { pizza.setDough("pan baked"); }
    public void buildSauce()   { pizza.setSauce("hot"); }
    public void buildTopping() { pizza.setTopping("pepperoni+salami"); }
}