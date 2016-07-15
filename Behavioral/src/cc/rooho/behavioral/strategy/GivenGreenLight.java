package cc.rooho.behavioral.strategy;

/**
 * package : cc.rooho.behavioral.strategy
 *
 * @author Y.J.ZHOU
 * @date 2016.6.20 11:17.
 */
public class GivenGreenLight implements IStrategy {
    @Override
    public void operate() {
        System.out.println("求吴国太开个绿灯，放行！");
    }
}
