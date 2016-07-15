package cc.rooho.creational.factory.abstract_factory;

import cc.rooho.creational.factory.simple_factory.Banz;

/**
 * package : cc.rooho.creational.factory
 * <p>
 * Description : banz 三厢车
 *
 * @author Y.J.ZHOU
 * @date 2016.7.14 15:46.
 */
public class Banz_Sedan implements ISedan {

    @Override
    public void drive() {
        System.out.println("Driving a Banz_Sedan !");
    }

    @Override
    public void openTrunk() {
        System.out.println("Open Trunk of Banz_Sedan .");
    }
}
