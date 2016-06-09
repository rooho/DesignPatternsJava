package cc.rooho.structural.adapter;

/**
 * package : cc.rooho.structural.adapter
 * <p>
 * Description :
 *
 * @author Y.J.ZHOU
 * @date 2016.6.6 23:25.
 */
public interface ISet<E> {
    public boolean add(E e);
    public boolean remove(Object o);
    public boolean isEmpty();
    public boolean contains(Object o);
}
