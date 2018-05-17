package cz.pkg.vyjimky;

public class Main {
    public static void main(String[] args) {
        TmpTrida tt = new TmpTrida();

        try {
            System.out.println(tt.omgMetoda());
        } catch (MojeVyjimkaException ex) {
            System.out.println("moje vyjimka");
        }
    }
}
