package cc.rooho.behavioral.state;

/**
 * package : cc.rooho.behavioral.state
 * <p>
 * Description :
 *
 * @author Y.J.ZHOU
 * @date 2016.7.16 11:03.
 */
public class EveningState implements IWorkState {
    @Override
    public void writeProgram(Work work) {
        if( work._hour < 21 ) {
            System.out.println("New time : " + work._hour + " , I had to continue !");
        } else {
            work.setState(new SleepingState());
            work.writeProgram();
        }
    }
}
