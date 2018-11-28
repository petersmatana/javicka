package cz.pkg.generika;

public class UncheckedErrorMessage {

    public static void main(String[] args) {
        Box<Integer> bi = getSimpleBox();
    }

    public static SimpleBox getSimpleBox() {
        return new SimpleBox();
    }

}
