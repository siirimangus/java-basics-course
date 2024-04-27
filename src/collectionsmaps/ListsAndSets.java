package collectionsmaps;

import java.util.*;

public class ListsAndSets {
    public static void main(String[] args) {
        // Exercise 1
        List<String> fruits = new ArrayList<>(List.of("apple", "pear", "plum"));
        System.out.println(fruits);
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Exercise 2
        List<Integer> numbers = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 6));
        Set<Integer> numbersSet = new HashSet<>(numbers);
        numbersSet.add(1);
        System.out.println(numbers);
        System.out.println(numbersSet);

        // Exercise 3
        System.out.println(doubling(List.of(1, 2, 3)));
        System.out.println(doubling(List.of(6, 8, 6, 8, -1)));

        // Exercise 4
        System.out.println(noTeen(List.of(12, 13, 19, 20)));
        System.out.println(noTeen(List.of(1, 14, 1)));
        System.out.println(noTeen(List.of(15)));
    }

    // Exercise 3
    public static List<Integer> doubling(List<Integer> input) {
        List<Integer> result = new ArrayList<>();

        for (Integer number : input) {
            result.add(number * 2);
        }

        return result;
    }

    // Exercise 4
    public static List<Integer> noTeen(List<Integer> input) {
        List<Integer> result = new ArrayList<>();

        for (Integer number : input) {
            if (number < 13 || number > 19) {
                result.add(number);
            }
        }

        return result;
    }
}