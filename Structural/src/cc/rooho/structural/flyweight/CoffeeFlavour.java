package cc.rooho.structural.flyweight;

/**
 * package : cc.rooho.structural.flyweight
 * <p>
 * Description :
 *
 * @author Y.J.ZHOU
 * @date 2016.7.16 16:54.
 */
public class CoffeeFlavour {
    private final String name;

    CoffeeFlavour(String newFlavor) {
        this.name = newFlavor;
    }

    @Override
    public String toString() {
        return name;
    }
}
