package original_tutorial.lambda;

/*

https://docs.oracle.com/javase/8/docs/technotes/guides/language/enhancements.html#javase8

-> https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html

*/

import original_tutorial.lambda.criteria.MaleOlderThan;
import original_tutorial.lambda.fnc_interface.StringFunction;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main2(String[] args) {
        BusinessLogic bl = new BusinessLogic();

        LocalDate olderThan = LocalDate.of(1990, 1,1);

        System.out.println("\n\ngetPersonsOlderThan");
        bl.printList(bl.getPersonsOlderThan(createPersons(), olderThan));

        System.out.println("\n\ngetPersonsOlderThan2");
        bl.printList(bl.getPersonsOlderThan2(createPersons(), new MaleOlderThan()));
    }

    public static void main3(String[] args) {
        BusinessLogic bl = new BusinessLogic();
        bl.getDoubleExample();
        bl.getStringExample();
        bl.tryGenericPrinter();
        bl.testNumbers();
    }

    public static void main(String[] args) {
        BusinessLogic bl = new BusinessLogic();
        bl.passFncAsArgument();
    }

    public static List<Person> createPersons() {
        List<Person> persons = new LinkedList<>();

        persons.add(new Person("person 1", LocalDate.of(1970, 12, 1), Person.Sex.MALE, "person@example.com"));
        persons.add(new Person("nobody 1", LocalDate.of(1989, 1, 31), Person.Sex.FEMALE, "nobody@secret.net"));
        persons.add(new Person("nobody 2", LocalDate.of(1980, 1, 31), Person.Sex.FEMALE, "nobody2@secret.net"));
        persons.add(new Person("person 2", LocalDate.of(2005, 12, 1), Person.Sex.MALE, "person2@example.com"));

        return persons;
    }

}
