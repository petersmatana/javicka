package lekce.L01;

import java.util.LinkedList;
import java.util.List;

public class BadFiltering {

    private static final String RED = "red";
    private static final String GREEN = "green";

    public static void main(String[] args) {
        System.out.println("\n------");
        System.out.println(filterGreenApples(inventory()));
        System.out.println(filterRedApples(inventory()));

        System.out.println("\n------");
        System.out.println(filterHeavyApples(inventory()));
        System.out.println(filterLightApples(inventory()));

    }

    private static List<Apple> filterGreenApples(List<Apple> inventory) {
        List<Apple> result = new LinkedList<Apple>();
        for (Apple apple: inventory){
            if (GREEN.equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }

    private static List<Apple> filterRedApples(List<Apple> inventory) {
        List<Apple> result = new LinkedList<Apple>();
        for (Apple apple: inventory){
            if (RED.equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }

    private static List<Apple> filterHeavyApples(List<Apple> inventory) {
        return filterApplesByWeight(inventory, 130);
    }

    private static List<Apple> filterLightApples(List<Apple> inventory) {
        return filterApplesByWeight(inventory, 100);
    }

    private static List<Apple> filterApplesByWeight(List<Apple> inventory, int weight) {
        List<Apple> result = new LinkedList<Apple>();
        for (Apple apple: inventory) {
            if (apple.getWeight() < weight) {
                result.add(apple);
            }
        }
        return result;
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
