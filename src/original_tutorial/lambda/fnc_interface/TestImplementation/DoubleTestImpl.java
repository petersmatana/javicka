package original_tutorial.lambda.fnc_interface.TestImplementation;

import original_tutorial.lambda.fnc_interface.MyNumberTest;

public class DoubleTestImpl implements MyNumberTest<Double> {
    @Override
    public boolean numberTest(Double a, Double b) {
        return a == b;
    }
}
