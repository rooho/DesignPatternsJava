package cc.rooho.creational.factory.abstract_factory;

import cc.rooho.creational.factory.*;

/**
 * package : cc.rooho.creational.factory.abstract_factory
 * <p>
 * Description : Hatchback 产品族
 *
 * @author Y.J.ZHOU
 * @date 2016.7.14 16:19.
 */
public class HatchBackFactory implements IFactory {
    @Override
    public IHatchback createCar(String car) {
        switch (car) {
            case "Banz_HatchBack":
                return new Banz_HatchBack();
            case "BMW_HatchBack":
                return new BMW_HatchBack();
            default:
                throw new IllegalArgumentException("Selection doesnot exist");
        }
    }
}
