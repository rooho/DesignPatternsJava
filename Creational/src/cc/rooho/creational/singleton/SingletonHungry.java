package cc.rooho.creational.singleton;

/**
 * package : cc.rooho.creational.singleton
 *
 * Description :
 *
 * @author Y.J.ZHOU
 * @date 2016.6.3 0:06.
 */
public class SingletonHungry {
    private SingletonHungry(){}
    private static SingletonHungry mInstances = new SingletonHungry();
    public static SingletonHungry getInstances(){
        return mInstances;
    }
}
