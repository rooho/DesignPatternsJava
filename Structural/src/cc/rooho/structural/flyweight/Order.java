package cc.rooho.structural.flyweight;

/**
 * package : cc.rooho.structural.flyweight
 * <p>
 * Description :
 *
 * @author Y.J.ZHOU
 * @date 2016.7.16 16:54.
 */
public class Order {
    private final int tableNumber;
    private final CoffeeFlavour flavour;

    Order(int tableNumber, CoffeeFlavour flavor) {
        this.tableNumber = tableNumber;
        this.flavour = flavor;
    }

    void serve() {
        System.out.println("Serving " + flavour + " to table " + tableNumber);
    }
}
