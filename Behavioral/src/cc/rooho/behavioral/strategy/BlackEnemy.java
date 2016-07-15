package cc.rooho.behavioral.strategy;

/**
 * package : cc.rooho.behavioral.strategy
 *
 * @author Y.J.ZHOU
 * @date 2016.6.20 11:17.
 */
public class BlackEnemy implements IStrategy {
    @Override
    public void operate() {
        System.out.println("孙夫人断后，挡住追兵...");
    }
}
