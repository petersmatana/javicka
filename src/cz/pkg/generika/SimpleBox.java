package cz.pkg.generika;

public class SimpleBox<T> implements Box<T> {

    private T t;

    public SimpleBox() {
    }

    @Override
    public void set(T t) {
        this.t = t;
    }

    @Override
    public T get() {
        return this.t;
    }

    @Override
    public String toString() {
        return "content = " + t.toString();
    }
}
