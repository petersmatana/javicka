package cz.pkg.streams;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/*

https://www.mkyong.com/tutorials/java-8-tutorials/

https://www.mkyong.com/java8/java-8-streams-map-examples/
https://www.mkyong.com/java8/java-8-streams-filter-examples/

* */

public class ToUppercase {

    public ToUppercase() {
        System.out.println("---------------------------------------");

        withStream1();

        System.out.println("---------------------------------------");

        withStream2();

        System.out.println("---------------------------------------");

        withStream3();

        System.out.println("---------------------------------------");

        withStream4();

        System.out.println("---------------------------------------");
    }

    public void withoutStream() {
        List<String> characters = new LinkedList<>();
        characters.add("a");
        characters.add("b");
        characters.add("c");

        List<String> newCharacters = new LinkedList<>();
        for (String s : characters) {
            newCharacters.add(s.toUpperCase());
        }
    }

    public void withStream1() {
        List<String> characters = new LinkedList<>();
        characters.add("a");
        characters.add("bbb");
        characters.add("c");

        List<String> result = characters.stream().filter(
            s -> {
                System.out.println("parcialni output = " + s);
                return s.length() > 2;
            }
        // collect vezme vystup a v tomto pripade ho konvertuje na list
        ).collect(Collectors.toList());

        System.out.println("withStream1 = " + result);
    }

    public void withStream2() {
        List<String> characters = new LinkedList<>();
        characters.add("a");
        characters.add("bbb");
        characters.add("c");

        List<String> result = characters
            .stream()
            .map(s -> s.toUpperCase())
            .collect(Collectors.toList());

        System.out.println("withStream2 = " + result);
    }

    public void withStream3() {
        List<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        List<Integer> result = numbers.stream().filter(
            s -> {
                if (s > 2) {
                    return true;
                } else {
                    return false;
                }
            }).collect(Collectors.toList());

        System.out.println("withStream3 = " + result);
    }

    public void withStream4() {
        List<Person> persons = new LinkedList<>();
        persons.add(new Person("tom", 123));
        persons.add(new Person("smonty", -13));
        persons.add(new Person("bob", 33));

        Person result1 = persons
                .stream()
                .filter(p -> "smonty".equals(p.getName()))
                .findAny()
                .orElse(null);
        System.out.println("result1 = " + result1);

        Person result2 = persons
                .stream()
                .filter(p -> "anonymous".equals(p.getName()))
                .findAny()
                .orElse(null);
        System.out.println("result2 = " + result2);
    }

}
