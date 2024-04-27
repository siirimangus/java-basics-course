package combinedexercises;

import java.util.Arrays;

public class Exercises2 {
    public static void main(String[] args) {
        // Exercise 6
        System.out.println(reverseString("The quick brown fox"));

        // Exercise 7
        numbers();

        // Exercise 8
        int[] products = getProducts(new int[]{5, 4, 10}, new int[]{1, 2, 3});
        System.out.println(Arrays.toString(products));

        // Exercise 9
        System.out.println(hasDistinctCharacters("xyyz"));

        // Exercise 10
        numberSorting(1, 4, 7);
        numberSorting(5, 4, 3);
        numberSorting(3, 2, 4);

        // Exercise 11
        getMaxNumber(59, 23, 14);

        // Exercise 12
        uniqueNumbers();

        // Exercise 13
        pattern(10);
    }

    // Exercise 6
    public static String reverseString(String input) {
        char[] letters = input.toCharArray();
        // Okay solution is also the one in the link, just printing out the letters
        // But here I will also introduce a new way to concatenate a string - StringBuilder
        StringBuilder result = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            // append method will add letters to the end of the string (result)
            result.append(letters[i]);
        }

        // In order to get the String out of the StringBuilder, we need to use the toString method
        return result.toString();
    }

    // Exercise 7
    public static void numbers() {
        // Print numbers divided by 3
        System.out.println("Divided by 3: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0)
                System.out.print(i + ", ");
        }

        // Print numbers divided by 5
        System.out.println("\nDivided by 5: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0)
                System.out.print(i + ", ");
        }

        // Print numbers divided by both 3 and 5
        System.out.println("\nDivided by 3 & 5: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.print(i + ", ");
        }

        System.out.println();
    }

    // Exercise 8
    public static int[] getProducts(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return new int[]{};
        }

        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] * arr2[i];
        }

        return result;
    }

    // Exercise 9
    public static boolean hasDistinctCharacters(String input) {
        // Convert the input string to a character array
        char[] chars = input.toCharArray();

        // Sort the character array in lexicographical order
        Arrays.sort(chars);

        // Check for repeated characters in the sorted array
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i-1]) {
                return false;
            }
        }

        // If no repeated characters are found, the string is considered to have all unique characters
        return true;
    }

    // Exercise 10
    public static void numberSorting(int x, int y, int z) {
        if (x < y && y < z) {
            System.out.println("Increasing order");
        } else if (x > y && y > z) {
            System.out.println("Decreasing order");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }

    // Exercise 11
    public static void getMaxNumber(int x, int y, int z) {
        if (x > y && x > z) {
            System.out.println("The biggest number is " + x);
        }

        if (y > x && y > z) {
            System.out.println("The biggest number is " + y);
        }

        if (z > x && z > y) {
            System.out.println("The biggest number is " + z);
        }
    }

    public static void uniqueNumbers() {
        // Initialize a counter for two-digit numbers
        int amount = 0;

        // Iterate through two nested loops to generate all unique two-digit numbers
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                // Check if 'i,' and 'j,' are different (not equal)
                if (i != j) {
                    amount++; // Increment the counter
                    System.out.println(i + "" + j); // Print the generated two-digit number
                }
            }
        }

        // Display the total number of generated two-digit numbers
        System.out.println("Total number of the two-digit-number is " + amount);
    }

    // Exercise 13
    public static void pattern(int number) {
        for(int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
