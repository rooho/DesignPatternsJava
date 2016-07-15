package cc.rooho.creational.factory.abstract_factory;

import cc.rooho.creational.factory.ICar;
import cc.rooho.creational.factory.IFactory;

/**
 * package : cc.rooho.creational.factory.abstract_factory
 * <p>
 * Description : Sedan 产品族
 *
 * @author Y.J.ZHOU
 * @date 2016.7.14 16:19.
 */
public class SedanFactory implements IFactory {
    @Override
    public ISedan createCar(String car) {
        switch (car) {
            case "Banz_Sedan":
                return new Banz_Sedan();
            case "BMW_Sedan":
                return new BMW_Sedan();
            default:
                throw new IllegalArgumentException("Selection doesnot exist");
        }
    }
}
