package lekce.L01;

import java.util.LinkedList;
import java.util.List;

public class BadListening2 {

    private static final String RED = "red";
    private static final String GREEN = "green";

    @FunctionalInterface
    public interface IntInterface {
        int get();
    }


    public void useIt() {
        IntInterface x = () -> {
            return 13;
        };
        System.out.println(x.get());
    }

    public static void main(String[] args) {
        // inventory();

        IntInterface x = () -> 132;

        System.out.println(x.get());

        // print();
    }

    private static void invertory() {
        System.out.println(filter(inventory(), new AppleColorPredicate()));

        System.out.println(filter(inventory(), (Apple a) -> {
            System.out.println(a);
            return new AppleColorPredicate().test(a);
        }));

        System.out.println("\n");

        System.out.println(filter(inventory(), new AppleWeightPredicate()));
        System.out.println(filter(inventory(), (Apple a) -> new AppleWeightPredicate().test(a)));
    }

    private static void print() {
        print(inventory(), new TinyPrint());

        print(inventory(), (Apple a) -> new StandartPrint().print(a));
    }

    private static List<Apple> inventory() {
        List<Apple> inventory = List.<Apple>of(
                new Apple(80, RED),
                new Apple(150, GREEN),
                new Apple(130, RED),
                new Apple(120, GREEN),
                new Apple(99, RED));

        return new LinkedList<>(inventory);
    }

    public static List<Apple> filter(List<Apple> inventory, ApplePredicate p) {
        List<Apple> result = new LinkedList<>();
        for (Apple apple : inventory) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    public static void print(List<Apple> inventory, ApplePrinter p) {
        for (Apple apple : new LinkedList<>(inventory)) {
            System.out.println(p.print(apple));
        }
    }

    @FunctionalInterface
    interface ApplePredicate {
        boolean test(Apple apple);
    }

    @FunctionalInterface
    interface ApplePrinter {
        String print(Apple apple);
    }

    public static class TinyPrint implements ApplePrinter {
        @Override
        public String print(Apple apple) {
            return "A w=" + apple.getWeight() + "c=" + apple.getColor();
        }
    }

    public static class StandartPrint implements ApplePrinter {
        @Override
        public String print(Apple apple) {
            return "Apple{" +
                    "weight=" + apple.getWeight() +
                    ", color='" + apple.getColor() + '\'' +
                    '}';
        }
    }

    public static class AppleWeightPredicate implements ApplePredicate {
        @Override
        public boolean test(Apple apple) {
            return apple.weight < 150;
        }
    }

    public static class AppleColorPredicate implements ApplePredicate {
        @Override
        public boolean test(Apple apple) {
            return GREEN.equals(apple.getColor());
        }
    }

    public static class Apple {
        private int weight;
        private String color;

        public Apple(int weight, String color) {
            this.weight = weight;
            this.color = color;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        @Override
        public String toString() {
            return "Apple{" +
                    "weight=" + weight +
                    ", color='" + color + '\'' +
                    '}';
        }
    }

}
