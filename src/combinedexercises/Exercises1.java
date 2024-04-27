package combinedexercises;

import java.util.HashMap;
import java.util.Map;

public class Exercises1 {
    public static void main(String[] args) {
        // Exercise 1
        printNumbers(5);

        // Exercise 2
        compareNumbers(3, 3);
        compareNumbers(5, 3);
        compareNumbers(3, 7);

        // Exercise 3
        System.out.println(containsFourOrSeven(new int[] {5, 4, 10}));
        System.out.println(containsFourOrSeven(new int[] {1, 2, 3, 8}));
        System.out.println(containsFourOrSeven(new int[] {1, 2, 7, 8}));

        // Exercise 4
        System.out.println(isSum(5, 15, 10));
        System.out.println(isSum(1, 1, 5));

        // Exercise 5
        displayMultiplicationTable(7);

        // Exercise 14
        Map<String, Integer> counts = countCharacterTypes("Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33");

        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        for (String key : counts.keySet()) {
            System.out.println(key + ": " + counts.get(key));
        }
    }

    // Exercise 1
    public static void printNumbers(int number) {
        String output = number + " + " + number + number + " + " + number + number + number;
        System.out.printf("%d + %d%d + %d%d%d%n", number, number, number, number, number, number);
        System.out.println(output);
    }

    // Exercise 2
    public static void compareNumbers(int num1, int num2) {
        if (num1 == num2) {
            System.out.println(num1 + " is equal to " + num2);
        } else if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else {
            System.out.println(num1 + " is less than " + num2);
        }
    }

    // Exercise 3
    public static boolean containsFourOrSeven(int[] arr) {
        for (int i : arr) {
            if (i == 4 || i == 7) {
                return true;
            }
        }

        return false;
    }

   // Exercise 4
    public static boolean isSum(int num1, int num2, int num3) {
        return num1 + num2 == num3 || num1 + num3 == num2 || num2 + num3 == num1;
    }

    // Exercise 5
    public static void displayMultiplicationTable(int number) {
        for (int i = 0; i <= number; i++) {
            System.out.println(number + " X " + i + " = " + number * i);
        }
    }

    // Exercise 14
    public static Map<String, Integer> countCharacterTypes(String text) {
        int lettersCount = 0, numbersCount = 0, spacesCount = 0, othersCount = 0;
        char[] chars = text.toCharArray();

        for (char c : chars) {
            if (Character.isLetter(c)) {
                lettersCount++;
            } else if (Character.isDigit(c)) {
                numbersCount++;
            } else if (Character.isSpaceChar(c)) {
                spacesCount++;
            } else {
                othersCount++;
            }
        }

        Map<String, Integer> result = new HashMap<>();
        result.put("letter", lettersCount);
        result.put("number", numbersCount);
        result.put("space", spacesCount);
        result.put("other", othersCount);

        return result;
    }
}
