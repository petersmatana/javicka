package cz.pkg.generika;

import java.util.List;

public class ShippingContainer<T> {

    public <T> ShippingContainer() {
    }

    public <T> void addBox(List<Box<T>> list, T t) {
        list.add(getSimpleBox(t));
    }

    public <T> Box<T> getSimpleBox(T t) {
        Box<T> box = new SimpleBox<>();
        box.set(t);

        return box;
    }

    public <T> void auditAllSimpleBoxes(List<Box<T>> list) {
        for (Box<T> box : list) {
            T value = box.get();

            System.out.println("box value = " + value);
        }
    }

}
