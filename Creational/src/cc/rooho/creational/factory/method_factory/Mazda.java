package cc.rooho.creational.factory.method_factory;

import cc.rooho.creational.factory.ICar;

/**
 * package : cc.rooho.creational.factory.method_factory
 * <p>
 * Description :
 *
 * @author Y.J.ZHOU
 * @date 2016.7.14 16:24.
 */
public class Mazda implements ICar {
    @Override
    public void drive() {
        System.out.println("Driving a Mazda!");
    }
}
