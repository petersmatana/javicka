package cz.pkg.generika;

public class SimplePair<K, V> implements Pair<K, V> {

    private K key;
    private V value;

    public SimplePair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return this.key;
    }

    @Override
    public void setKey(K k) {
        this.key = k;
    }

    @Override
    public V getValue() {
        return this.value;
    }

    @Override
    public void setValue(V v) {
        this.value = v;
    }
}
