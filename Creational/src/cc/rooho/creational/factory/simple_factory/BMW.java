package cc.rooho.creational.factory.simple_factory;

import cc.rooho.creational.factory.ICar;

/**
 * package : cc.rooho.creational.factory.simple_factory
 * <p>
 * Description :
 *
 * @author Y.J.ZHOU
 * @date 2016.7.14 11:25.
 */
public class BMW implements ICar {
    @Override
    public void drive() {
        System.out.println("Driving a BMW!");
    }
}
