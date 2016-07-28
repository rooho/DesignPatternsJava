package cc.rooho.creational.prototype;

/**
 * package : cc.rooho.creational.prototype
 * <p>
 * Description :
 *
 * @author Y.J.ZHOU
 * @date 2016.7.18 21:00.
 */
public class Prototype implements Cloneable {
    private int _size;
    private String _name;

    public Prototype(int size, String name) {
        _size = size;
        _name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return " Prototype size : " + _size + "  ,  name  " + _name + "\n";
    }
}
