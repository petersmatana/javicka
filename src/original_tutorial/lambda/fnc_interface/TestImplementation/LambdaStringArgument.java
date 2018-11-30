package original_tutorial.lambda.fnc_interface.TestImplementation;

import original_tutorial.lambda.fnc_interface.StringFunction;

public class LambdaStringArgument {

    public String changeString(StringFunction sf, String s) {
        return sf.func(s);
    }

    public StringFunction appendPrefix() {
        String tmp = "asd";

        StringFunction sf = (String string) -> {
            return "prefix + " + string + tmp;
        };

        return sf;
    }

    public StringFunction appendSuffix() {
        StringFunction sf = (String string) -> {
            return string + " + suffix";
        };

        return sf;
    }

    public static void staticMethodReference() {
        System.out.println("static method reference");
    }
}
