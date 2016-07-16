package cc.rooho.behavioral.state;

/**
 * package : cc.rooho.behavioral.state
 * <p>
 * Description :
 *
 * @author Y.J.ZHOU
 * @date 2016.7.16 10:47.
 */
public class Work {
    int _hour;
    IWorkState _state;

    public void setState(IWorkState state) {
        _state = state;
    }

    public void writeProgram() {
        _state.writeProgram(this);
    }
}
