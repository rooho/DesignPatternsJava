package cc.rooho.creational.singleton;

/**
 * package : cc.rooho.creational.singleton
 *
 * Description :
 *
 * @author Y.J.ZHOU
 * @date 2016.6.2 23:19.
 */
public class SingletonLazy {
    private SingletonLazy(){}
    private volatile static SingletonLazy mInstances;
    public static SingletonLazy getInstances(){
        if(mInstances == null){
            synchronized (SingletonLazy.class) {
                if(mInstances == null){
                    mInstances = new SingletonLazy();
                }
            }
        }
        return mInstances;
    }
}
