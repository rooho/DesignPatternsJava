package cc.rooho.creational.factory.simple_factory;

import cc.rooho.creational.factory.ICar;

/**
 * package : cc.rooho.creational.factory.simple_factory
 * <p>
 * Description :
 *
 * @author Y.J.ZHOU
 * @date 2016.7.14 11:26.
 */
public class CarFactory {
    public static ICar createCar(String carName){
        switch (carName) {
            case "Banz":
                return new Banz();
            case "BMW":
                return new BMW();
            default:
                return null;
        }
    }
}
