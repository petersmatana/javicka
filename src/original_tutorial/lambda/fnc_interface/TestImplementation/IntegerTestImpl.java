package original_tutorial.lambda.fnc_interface.TestImplementation;

import original_tutorial.lambda.fnc_interface.MyNumberTest;

public class IntegerTestImpl implements MyNumberTest<Integer> {

    @Override
    public boolean numberTest(Integer a, Integer b) {
        return a == b;
    }
}
