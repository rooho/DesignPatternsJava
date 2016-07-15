package cc.rooho.creational.factory.abstract_factory;

import cc.rooho.creational.factory.simple_factory.BMW;

/**
 * package : cc.rooho.creational.factory
 * <p>
 * Description : BMW 三厢车
 *
 * @author Y.J.ZHOU
 * @date 2016.7.14 15:46.
 */
public class BMW_Sedan implements ISedan {

    @Override
    public void drive() {
        System.out.println("Driving a BMW_Sedan !");
    }

    @Override
    public void openTrunk() {
        System.out.println("Open Trunk of BMW_Sedan .");
    }
}
