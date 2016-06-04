package cc.rooho.creational.singleton;

/**
 * package : cc.rooho.creational.singleton
 * <p>
 * Description :
 *
 * @author Y.J.ZHOU
 * @date 2016.6.3 10:43.
 */
public class SingletonLazyHolderClass {
    private SingletonLazyHolderClass(){};
    private static class SingletonHolder {
        private static SingletonLazyHolderClass mInstances = new SingletonLazyHolderClass();
    }
    public static SingletonLazyHolderClass getInstance(){
        return SingletonHolder.mInstances;
    }
}
