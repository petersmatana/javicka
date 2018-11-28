package cz.pkg.generika;

public interface Pair<K, V> {

    public K getKey();

    public void setKey(K k);

    public V getValue();

    public void setValue(V v);

}
