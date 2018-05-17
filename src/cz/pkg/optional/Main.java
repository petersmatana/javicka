package cz.pkg.optional;

public class Main {

    public static void main(String[] args) {

        /*
         * PRAVIDLA
         * #1: Nikdy do Optional neprirazovat null!
         * #2: Nikdy nepozivat Optional.get() dokud nemuzu overit ze v Optional neco je
         * #3: Je lepsi pouzivat jine alternativy nez Optional.isPresent() a Optional.get()
         * */

        // new MyOptional();

        PracticalOptional practicalOptional = new PracticalOptional();

        String name = practicalOptional.findPersonNameByAge2(1000);
        System.out.println("mam tu = " + name);
    }
}
