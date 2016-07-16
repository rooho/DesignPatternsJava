package cc.rooho.behavioral.state;

/**
 * package : cc.rooho.behavioral.state
 * <p>
 * Description :
 *
 * @author Y.J.ZHOU
 * @date 2016.7.16 11:01.
 */
public class AfterNoonState implements IWorkState {
    @Override
    public void writeProgram(Work work) {
        if( work._hour < 17 ) {
            System.out.println("Now time : " + work._hour + " , I had to continue !");
        } else {
            work.setState(new EveningState());
            work.writeProgram();
        }
    }
}
