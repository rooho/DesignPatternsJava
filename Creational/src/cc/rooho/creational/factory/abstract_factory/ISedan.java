package cc.rooho.creational.factory.abstract_factory;

import cc.rooho.creational.factory.ICar;

/**
 * package : cc.rooho.creational.factory.abstract_factory
 * <p>
 * Description : 三厢车
 *
 * @author Y.J.ZHOU
 * @date 2016.7.14 15:35.s
 */
public interface ISedan extends ICar {
    /* 打开后备箱 */
    public void openTrunk();
}
