package lekce.L02;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class MyStream_Filter {

    private static final String RED = "red";
    private static final String GREEN = "green";
    private static final String BLUE = "blue";

    public static void main(String[] args) {
        new MyStream_Filter();
    }

    public MyStream_Filter() {
        List<Apple> l = inventory()
                .stream()
                .filter((Apple apple) ->
                        apple.getColor().equals(GREEN) &&
                        apple.getWeight() > 113)
                .collect(Collectors.toList());

        System.out.println(l);
    }

    /*
    public MyStream_Map.Jabko bigGreen() {
        return (Apple apple) -> apple.getColor().equals(GREEN) && apple.getWeight() > 113;
    }
    */

    private static List<Apple> inventory() {
        List<Apple> inventory = List.<Apple>of(
                new Apple(80, RED),
                new Apple(150, BLUE),
                new Apple(130, RED),
                new Apple(120, GREEN),
                new Apple(99, RED),
                new Apple(60, BLUE),
                new Apple(110, GREEN),
                new Apple(100, RED),
                new Apple(85, BLUE),
                new Apple(90, RED));

        return new LinkedList<>(inventory);
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
