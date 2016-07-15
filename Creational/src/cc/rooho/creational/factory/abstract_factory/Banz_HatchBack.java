package cc.rooho.creational.factory.abstract_factory;

import cc.rooho.creational.factory.simple_factory.Banz;

/**
 * package : cc.rooho.creational.factory
 * <p>
 * Description : banz 两厢车
 *
 * @author Y.J.ZHOU
 * @date 2016.7.14 15:37.
 */
public class Banz_HatchBack implements IHatchback {

    @Override
    public void drive() {
        System.out.println("Driving a Banz_HatchBack !");
    }

    @Override
    public void openBackShroud() {
        System.out.println("Open Back Shroud of Banz_HatchBack .");
    }
}
