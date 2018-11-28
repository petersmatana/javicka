package cz.pkg.generika;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        lesson1();
//        lesson2();
//        lesson3();
        lesson4();
    }

    public static void lesson1() {
        SimplePair<String, Integer> p1 = new SimplePair<>("key", 1);

        SimpleBox<String> stringBox = new SimpleBox<>();
        stringBox.set("hello world");

        SimplePair<Integer, Box<String>> p2 = new SimplePair<>(1, stringBox);
    }

    public static void lesson2() {
        SimplePair<Integer, String> sp1 = new SimplePair<>(1, "key");
        SimplePair<Integer, String> sp2 = new SimplePair<>(1, "key");
        SimplePair<Integer, String> sp3 = new SimplePair<>(2, "key2");

        Util u = new Util();

        boolean c1 = u.<Integer, String>compare(sp1, sp2);
        boolean c2 = u.<Integer, String>compare(sp2, sp3);
    }

    public static void lesson3() {
        Util u = new Util();

        Pair p1 = new SimplePair<>(1, "hello");
        Pair newPair = u.getPair(p1);
        System.out.println(newPair.getValue());

        Pair p2 = new SimplePair<>("key", "hello 2");
        Pair newPair2 = u.getPair(p2);
        System.out.println(newPair2.getValue());
    }

    public static void lesson4() {
        ShippingContainer<String> shippingContainer = new ShippingContainer<>();

        List<Box<String>> containers = new LinkedList<>();

        shippingContainer.<String>addBox(containers, "prvni krabice");
        shippingContainer.<String>addBox(containers, "druha krabice");

        shippingContainer.<String>auditAllSimpleBoxes(containers);
    }

}
