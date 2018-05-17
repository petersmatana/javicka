package cz.pkg.vyjimky;

public class MojeVyjimkaException extends Exception {
    public MojeVyjimkaException(String messenger) {
        super(messenger);
    }
}
