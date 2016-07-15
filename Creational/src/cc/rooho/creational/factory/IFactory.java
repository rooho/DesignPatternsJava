package cc.rooho.creational.factory;

import cc.rooho.creational.factory.ICar;

/**
 * package : cc.rooho.creational.factory.method_factory
 * <p>
 * Description :
 *
 * @author Y.J.ZHOU
 * @date 2016.7.14 14:07.
 */
public interface IFactory {
    public ICar createCar(String car);
}
