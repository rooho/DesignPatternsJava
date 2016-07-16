package cc.rooho.behavioral.state;

/**
 * package : cc.rooho.behavioral.state
 * <p>
 * Description :
 *
 * @author Y.J.ZHOU
 * @date 2016.7.16 11:32.
 */
public class SleepingState implements IWorkState {
    @Override
    public void writeProgram(Work work) {
        System.out.println("Too late, I had to sleep !");
    }
}
