package cc.rooho.creational.factory.abstract_factory;

import cc.rooho.creational.factory.ICar;

/**
 * package : cc.rooho.creational.factory.abstract_factory
 * <p>
 * Description : 两厢车
 *
 * @author Y.J.ZHOU
 * @date 2016.7.14 15:35.
 */
public interface IHatchback extends ICar {
    /* 打开后盖板 */
    public void openBackShroud();
}
