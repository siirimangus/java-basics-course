package collectionsmaps;

import java.util.*;

public class Maps {
    public static void main(String[] args) {
        // Exercise 1
        Map<String, Integer> studentGrades = new HashMap<>();
        studentGrades.put("John", 3);
        studentGrades.put("Linda", 4);
        studentGrades.put("Peter", 5);
        studentGrades.put("Mark", 5);
        studentGrades.put("Alice", 4);

        studentGrades.remove("Linda");

        studentGrades.get("Peter");

        // Exercise 2
        List<String> topPerformingStudents = new ArrayList<>();
        for (Map.Entry<String, Integer> student : studentGrades.entrySet()) {
            if (student.getValue() >= 4) {
                topPerformingStudents.add(student.getKey());
            }
        }
        System.out.println(topPerformingStudents);

        // Exercise 3
        Map<String, String> first = new HashMap<>();
        first.put("ice cream", "cherry");
        System.out.println(topping2(first));

        Map<String, String> second = new HashMap<>();
        second.put("spinach", "dirt");
        second.put("ice cream", "cherry");
        System.out.println(topping2(second));

        Map<String, String> third = new HashMap<>();
        third.put("yogurt", "salt");
        System.out.println(topping2(third));

        // Exercise 4
        Map<String, String> ab1 = new HashMap<>();
        ab1.put("a", "aaa");
        ab1.put("c", "cake");
        System.out.println(mapAB3(ab1));

        Map<String, String> ab2 = new HashMap<>();
        ab2.put("b", "bbb");
        ab2.put("c", "cake");
        System.out.println(mapAB3(ab2));

        Map<String, String> ab3 = new HashMap<>();
        ab3.put("a", "aaa");
        ab3.put("b", "bbb");
        ab3.put("c", "cake");
        System.out.println(mapAB3(ab3));

        // Exercise 5
        System.out.println(wordCount(new String[] {"a", "b", "a", "c", "b"}));
        System.out.println(wordCount(new String[] {"c", "b", "a"}));
        System.out.println(wordCount(new String[] {"c", "c", "c", "c"}));

        // Exercise 6
        System.out.println(wordLen(new String[] {"a", "bb", "a", "bb"}));
        System.out.println(wordLen(new String[] {"this", "and", "that", "and"}));
        System.out.println(wordLen(new String[] {"code", "code", "code", "bug"}));
    }

    // Exercise 3
    public static Map<String, String> topping2(Map<String, String> foodWithTopping) {
        Map<String, String> result = new HashMap<>();

        for (String key : foodWithTopping.keySet()) {
            String value = foodWithTopping.get(key);

            if (key.equals("ice cream") && !value.isEmpty()) {
                result.put(key, value);
                result.put("yogurt", value);
            } else if (key.equals("spinach") && !value.isEmpty()) {
                result.put("spinach", "nuts");
            } else {
                result.put(key, value);
            }
        }

        return result;
    }

    // Exercise 4
    public static Map<String, String> mapAB3(Map<String, String> input) {
        // As I don't want to change the input map, I will create a new map
        // that is a copy of the input map
        Map<String, String> result = new HashMap<>(input);

        boolean hasKeyAAndValue = input.containsKey("a") && !input.get("a").isEmpty();
        boolean hasKeyBAndValue = input.containsKey("b") && !input.get("b").isEmpty();

        if (hasKeyAAndValue && hasKeyBAndValue) {
            return result;
        }

        if (hasKeyAAndValue) {
            result.put("b", input.get("a"));
        }

        if (hasKeyBAndValue) {
            result.put("a", input.get("b"));
        }

        return result;
    }

    // Exercise 5
    public static Map<String, Integer> wordCount(String[] words) {
        Map<String, Integer> result = new HashMap<>();

        for (String word : words) {
            if (result.containsKey(word)) {
                int value = result.get(word);
                result.replace(word, value + 1);
            } else {
                result.put(word, 1);
            }
        }

        return result;
    }

    // Exercise 6
    public static Map<String, Integer> wordLen(String[] words) {
        Map<String, Integer> result = new HashMap<>();

        for (String word : words) {
            if (!result.containsKey(word)) {
                result.put(word, word.length());
            }
        }

        return result;
    }
}
