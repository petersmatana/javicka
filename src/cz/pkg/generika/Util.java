package cz.pkg.generika;

public class Util {

    public <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
        return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());
    }

    public <X extends Pair<?, String>> Pair getPair(Pair<?, String> pair) {
        pair.setValue("INSPECT = " + pair.getValue());
        return pair;
    }

    public <String, Integer> void method(String s, Integer i) {
        //
    }
}
