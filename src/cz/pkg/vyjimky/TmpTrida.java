package cz.pkg.vyjimky;

public class TmpTrida {

    public TmpTrida() {
    }

    public String omgMetoda() throws MojeVyjimkaException {
        if (10 > 3) {
            throw new MojeVyjimkaException("asd");
        }

        return new String("ahoj");
    }

}
