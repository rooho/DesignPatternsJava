package cc.rooho.behavioral.strategy;

/**
 * package : cc.rooho.behavioral.strategy
 *
 * @author Y.J.ZHOU
 * @date 2016.6.20 11:17.
 */
public class Context {
    private IStrategy strategy;
    //构造函数，要你使用哪个妙计
    public Context(IStrategy strategy){
        this.strategy = strategy;
    }

    public void operate(){
        this.strategy.operate();
    }
}
