package cc.rooho.structural.adapter;

import java.util.Map;

/**
 * package : cc.rooho.structural.adapter
 * <p>
 * Description :
 *
 * @author Y.J.ZHOU
 * @date 2016.6.6 23:32.
 */
public class HHashMap<K,V> {

    transient Node<K,V>[] table;

    public V get(Object key) {
        // table get node
        return null;
    }

    public V put(K key, V value) {
        // table put node
        return null;
    }

    public V remove(Object key) {
        // remote node from table
        return null;
    }

    static class Node<K,V> {
        private V value;
        private K key;
    }
}
