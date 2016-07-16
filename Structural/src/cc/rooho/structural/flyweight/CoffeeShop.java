package cc.rooho.structural.flyweight;

import java.util.List;
import java.util.Vector;

/**
 * package : cc.rooho.structural.flyweight
 * <p>
 * Description :
 *
 * @author Y.J.ZHOU
 * @date 2016.7.16 16:55.
 */
public class CoffeeShop {
    private final List<Order> orders = new Vector<Order>();
    private final Menu menu = new Menu();

    void takeOrder(String flavourName, int table) {
        CoffeeFlavour flavour = menu.lookup(flavourName);
        Order order = new Order(table, flavour);
        orders.add(order);
    }

    void service() {
        for (Order order : orders)
            order.serve();
    }

    String report() {
        return "\ntotal CoffeeFlavour objects made: "
                + menu.totalCoffeeFlavoursMade();
    }
}
