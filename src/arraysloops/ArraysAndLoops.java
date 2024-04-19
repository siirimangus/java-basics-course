package arraysloops;

import java.util.Arrays;

public class ArraysAndLoops {
    public static void printFruits() {
        String[] fruits = {"apple", "pear", "banana"};

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println(fruits); // prints out memory address
        System.out.println(Arrays.toString(fruits));
    }

    public static String[] deleteFromArray(String[] array, String value) {
        String[] result = new String[array.length];

        for (int i = 0; i < array.length; i++) {
            String element = array[i];

            if (!element.equals(value)) {
                result[i] = element;
            }

//            Alternative if statement
//            if (element.equals(value)) {
//                continue;
//            }
//
//            result[i] = element;
        }

        return result;
    }

    public static boolean existsInArray(String[] array, String value) {
        for (String s : array) {
            if (s.equals(value)) {
                return true;
            }
        }

        return false;
    }

    public static String[] addToArrayWithLoops(String[] array, String value, int index) {
        String[] enhancedArray = new String[array.length + 1];

        for (int i = 0; i < index; i++) {
            enhancedArray[i] = array[i];
        }

        enhancedArray[index] = value;

        for (int i = index; i < array.length; i++) {
            enhancedArray[i + 1] = array[i];
        }

        return enhancedArray;
    }

    public static String[] addToArrayWithCopy(String[] array, String value, int index) {
        String[] enhancedArray = new String[array.length + 1];

        if (index >= 0) {
            // didn't have this copy method on the slides, but check it out from here
            // https://www.geeksforgeeks.org/system-arraycopy-method-in-java-with-examples/
            System.arraycopy(array, 0, enhancedArray, 0, index);
        }

        enhancedArray[index] = value;

        if (array.length - index >= 0) {
            System.arraycopy(array, index, enhancedArray, index + 1, array.length - index);
        }

        return enhancedArray;
    }

    public static char[] populateArray() {
        char[] chars = new char[10];
        char[] givenChars = {'v', 'k', 'a', 's', 'd'};

        for (int i = 0; i < 10; i++) {
            int charIndex = i / 2;
            chars[i] = givenChars[charIndex];
        }

        Arrays.sort(chars);

        return chars;
    }

    public static int sumFirstTwoElementsInArray(int[] input) {
        if (input.length == 0) {
            return 0;
        }

        // actually, if the length is < 2, then it must be 1
        // and there is nothing to sum up :)
        if (input.length < 2) {
            return input[0];
        }

        return input[0] + input[1];
    }

    public static boolean lucky13(int[] input) {
        boolean hasOneOrThree = false;

        for (int number : input) {
            if (number == 1 || number == 3) {
                hasOneOrThree = true;
                break;
            }
        }

        return hasOneOrThree;
    }

    public static void main(String[] args) {
//        printFruits();
//
//        String[] fruits = {"apple", "pear", "banana"};
//        String deleteValue = "some";
//        String[] result = deleteFromArray(fruits, deleteValue);
//        String[] result2 = deleteFromArray(new String[] {"apple", "pear", "banana"}, "pear");
//        System.out.println(Arrays.toString(result));

//        System.out.println(existsInArray(new String[]{"one", "two"}, "three"));
//        System.out.println(existsInArray(new String[]{"one", "two"}, "one"));

//        String[] array = {"one", "two", "three", "four"};
//        String[] newArrayWithLoop = addToArrayWithLoops(array, "new", 2);
//        String[] newArrayWithCopy = addToArrayWithCopy(array, "new", 2);
//        System.out.println(Arrays.toString(newArrayWithLoop));
//        System.out.println(Arrays.toString(newArrayWithCopy));

//        char[] charArray = populateArray();
//        System.out.println(Arrays.toString(charArray));

//        System.out.println(sumFirstTwoElementsInArray(new int[]{1, 2, 3}));
//        System.out.println(sumFirstTwoElementsInArray(new int[]{}));
//        System.out.println(sumFirstTwoElementsInArray(new int[]{1}));

//        System.out.println(lucky13(new int[]{1, 2, 3}));
//        System.out.println(lucky13(new int[]{4, 2, 7, 8}));
    }
}
