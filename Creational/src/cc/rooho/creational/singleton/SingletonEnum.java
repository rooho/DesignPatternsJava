package cc.rooho.creational.singleton;

/**
 * package : cc.rooho.creational.singleton
 * <p>
 * Description :
 *
 * @author Y.J.ZHOU
 * @date 2016.6.3 10:49.
 */
public enum SingletonEnum {
    uniqueInstance;

    public String getMsg(){
        return this.toString() + " , " + this.getClass();
    }
}
