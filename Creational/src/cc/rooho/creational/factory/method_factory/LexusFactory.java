package cc.rooho.creational.factory.method_factory;

import cc.rooho.creational.factory.ICar;
import cc.rooho.creational.factory.IFactory;

/**
 * package : cc.rooho.creational.factory.method_factory
 * <p>
 * Description :
 *
 * @author Y.J.ZHOU
 * @date 2016.7.14 14:07.
 */
public class LexusFactory implements IFactory {
    @Override
    public ICar createCar(String car) {
        switch (car) {
            case "Lexus":
                return new Lexus();
            default:
                throw new IllegalArgumentException("Selection doesnot exist");
        }
    }
}
