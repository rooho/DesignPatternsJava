package cc.rooho.creational.builder;

/**
 * package : cc.rooho.creational.builder
 * <p>
 * Description :
 *
 * @author Y.J.ZHOU
 * @date 2016.8.1 10:07.
 */
public class HawaiianPizzaBuilder extends PizzaBuilder {
    public void buildDough()   { pizza.setDough("cross"); }
    public void buildSauce()   { pizza.setSauce("mild"); }
    public void buildTopping() { pizza.setTopping("ham+pineapple"); }
}
