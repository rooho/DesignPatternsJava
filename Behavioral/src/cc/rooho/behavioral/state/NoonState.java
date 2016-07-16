package cc.rooho.behavioral.state;

/**
 * package : cc.rooho.behavioral.state
 * <p>
 * Description :
 *
 * @author Y.J.ZHOU
 * @date 2016.7.16 10:52.
 */
public class NoonState implements IWorkState {
    @Override
    public void writeProgram(Work work) {
        if( work._hour < 13 ) {
            System.out.println("Now time : " + work._hour + " , I feel a little drowsy !");
        } else {
            work.setState(new AfterNoonState());
            work.writeProgram();
        }
    }
}
