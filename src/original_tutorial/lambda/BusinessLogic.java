package original_tutorial.lambda;

import original_tutorial.lambda.criteria.Predicate;
import original_tutorial.lambda.fnc_interface.*;
import original_tutorial.lambda.fnc_interface.TestImplementation.DoubleTestImpl;
import original_tutorial.lambda.fnc_interface.TestImplementation.LambdaStringArgument;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class BusinessLogic {

    public BusinessLogic() {

    }

    public List<Person> getPersonsOlderThan(List<Person> persons, LocalDate age) {
        List<Person> result = new LinkedList<>();
        for (Person person : persons) {
            if (person.getBirthday().isBefore(age)) {
                result.add(person);
            }
        }

        return result;
    }

    public List<Person> getPersonsOlderThan2(List<Person> persons, Predicate<Person> predicate) {
        List<Person> result = new LinkedList<>();

        for (Person person : persons) {
            if (predicate.test(person)) {
                result.add(person);
            }
        }

        return result;
    }

    public void printList(List<Person> persons) {
        for (Person person : persons) {
            System.out.println(person.toString());
        }
    }

    public void getDoubleExample() {
        System.out.println("\ndouble example");

        MyDouble value = () -> 10.1;
        System.out.println("value = " + value.getValue());

        MyDouble value2;
        value2 = () -> 13.3;
        System.out.println("value2 = " + value2.getValue());

        MyDouble value3 = () -> {
            return 10.1;
        };
        System.out.println("value3 = " + value3.getValue());
    }

    public void getStringExample() {
        System.out.println("\nstring example");

        MyString value = () -> "ahoj";
        System.out.println("value = " + value.getValue());
    }

    public void tryGenericPrinter() {
        System.out.println("\ngeneric printer");

        MyGenericPrinter<String> gp1 = (String s) -> {
            System.out.println("print = " + s);
        };
        gp1.printValue("asd");

        MyGenericPrinter<Integer> gp2 = (Integer i) -> {
            System.out.println("print = " + i.toString());
        };
        gp2.printValue(13);
    }

    public void testNumbers() {
        System.out.println("\ntest numbers");

        MyNumberTest<Integer> test = (Integer i1, Integer i2) -> {
            return i1 == i2;
        };
        System.out.println(test.numberTest(1, 1));

        DoubleTestImpl test2 = new DoubleTestImpl();
        System.out.println(test2.numberTest(1.0, 1.0));
    }

    public void passFncAsArgument() {
        String inputString = "this is input string";

        LambdaStringArgument operation = new LambdaStringArgument();

        System.out.println(operation.changeString(operation.appendPrefix(), inputString));
        System.out.println(operation.changeString(operation.appendSuffix(), inputString));
    }

}
