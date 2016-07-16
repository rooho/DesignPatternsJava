package cc.rooho.behavioral.state;

/**
 * package : cc.rooho.behavioral.state
 * <p>
 * Description :
 *
 * @author Y.J.ZHOU
 * @date 2016.7.16 10:48.
 */
public class ForenoonState implements IWorkState {
    @Override
    public void writeProgram(Work work) {
        if( work._hour < 12 ) {
            System.out.println("Now time : " + work._hour + " , I am in a good conditions!");
        } else {
            work.setState(new NoonState());
            work.writeProgram();
        }
    }
}
