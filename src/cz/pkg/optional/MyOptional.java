package cz.pkg.optional;

import java.util.Optional;

public class MyOptional {

    public MyOptional() {
        System.out.println("\n\n");
        optionalOf();
        System.out.println("\n\n");
        nullValue();
        System.out.println("\n\n");
        emptyValue();
        System.out.println("\n\n");
        orElseMethod();
        System.out.println("\n\n");
    }

    public void optionalOf() {
        System.out.println("--- Optional.of ---");
        Optional<String> moznost = Optional.of(new String("toto je string"));

        System.out.println("moznost = " + moznost);
        System.out.println("moznost.get() = " + moznost.get());
        System.out.println("moznost.isPresent() = " + moznost.isPresent());
        System.out.println("Optional.ofNullable(moznost) = " + Optional.ofNullable(moznost));
    }

    public void nullValue() {
        System.out.println("--- Null Value ---");
        Optional<String> moznost = null;

        System.out.println("moznost = " + moznost);

        try {
            moznost.ifPresent(s -> System.out.println("moznost.get() = " + moznost.get()));
        } catch (NullPointerException ex) {
            System.err.println("chyba moznost.get()" + ex.toString());
        }

        try {
            System.out.println("moznost.isPresent() = " + moznost.isPresent());
        } catch (NullPointerException ex) {
            System.err.println("chyba moznost.isPresent()" + ex.toString());
        }

        System.out.println("Optional.ofNullable(moznost) = " + Optional.ofNullable(moznost));
    }

    public void emptyValue() {
        System.out.println("--- Empty value ---");
        Optional<String> moznost = Optional.empty();

        System.out.println("moznost = " + moznost);
        if (moznost.isPresent()) {
            System.out.println("moznost.get() = " + moznost.get());
        }
        System.out.println("moznost.isPresent() = " + moznost.isPresent());
        System.out.println("Optional.ofNullable(moznost) = " + Optional.ofNullable(moznost));
    }

    public void orElseMethod() {
        System.out.println("--- Optional.of ---");
        Optional<String> moznost = Optional.empty();

        System.out.println("moznost = " + moznost.orElse("orElse se vola"));

        System.out.println("moznost = " + moznost.orElseGet(() -> new String("novy string")));
    }
}
