package cc.rooho.structural.adapter;

/**
 * package : cc.rooho.structural.adapter
 * <p>
 * Description :
 *
 * @author Y.J.ZHOU
 * @date 2016.6.6 23:32.
 */
public class HHashSet<E> implements ISet<E> {
    private static final Object PRESENT = new Object();
    private transient HHashMap<E,Object> map;
    @Override
    public boolean add(E e) {
        return (map.put(e, PRESENT) != null);
    }

    @Override
    public boolean remove(Object o) {
        return (map.remove(o) != null);
    }

    @Override
    public boolean isEmpty() {
        return (map.get(PRESENT) == null);
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }
}
