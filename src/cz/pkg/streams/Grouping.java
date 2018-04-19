package cz.pkg.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Grouping {

    public Grouping() {
        System.out.println("---------------------------------------");

        example1();

        System.out.println("---------------------------------------");

        example3();

        System.out.println("---------------------------------------");

        example4();

        System.out.println("---------------------------------------");

        example5();

        System.out.println("---------------------------------------");
    }

    public void example1() {
        List<String> items = Arrays.asList("apple", "apple", "banana",
                        "apple", "orange", "banana", "papaya");

        Map<String, Long> result = items
                .stream()
                .collect(
                        Collectors.groupingBy(Function.identity(), Collectors.counting())
                );

        System.out.println(result);
    }

    /*
    public void example2() {
        List<String> items = Arrays.asList("apple", "apple", "banana",
                "apple", "orange", "banana", "papaya");

        Map<String, Long> result = items.stream().collect(
                Collectors.counting(Function.identity(), Collectors.counting())
        );

        System.out.println();
    }
    */

    public void example3() {
        Stream<String> language = Stream.of("java", "python", "node", null, "ruby", null, "php");

        // List<String> result = language.collect(Collectors.toList());

        List<String> result = language
                .filter(string -> string != null)
                .collect(Collectors.toList());

        result.forEach(System.out::println);
    }

    public void example4() {
        String[] array = {"a", "b", "c", "d", "e"};

        Stream<String> stream1 = Arrays.stream(array);
        stream1.forEach(item -> {
            System.out.println("co tu mam = " + item);
        });
    }

    public void example5() {
        String[] array = {"a", "b", "c", "d", "e", "b"};
        Stream<String> stream = Arrays.stream(array);

        // loop a stream
        // stream.forEach(x -> System.out.println(x));

        // reuse it to filter again! throws IllegalStateException
        long count = stream.filter(x -> "b".equals(x)).count();

        System.out.println(count);
    }

}
