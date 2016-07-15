package cc.rooho.behavioral.strategy;

/**
 * package : cc.rooho.behavioral.strategy
 *
 * @author Y.J.ZHOU
 * @date 2016.6.20 11:17.
 */
public class BackDoor implements IStrategy {
    @Override
    public void operate() {
        System.out.println("找乔国老帮忙，让吴国太给孙权施加压力，使孙权不能杀刘备...");
    }
}
