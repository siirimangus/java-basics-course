package exceptions;

public class MinimumElement {
    public static int minimumElement(int[] integers) {
        if (integers == null || integers.length == 0) {
            throw new IllegalArgumentException();
        }

        int minimum = integers[0];

        for (int integer : integers) {
            if (integer < minimum) {
                minimum = integer;
            }
        }

        return minimum;
    }

    public static void main(String[] args) {
        int[] numbers = { 3, 4, 6, 2, 3, 7 };
        int minimumElement = minimumElement(numbers);
        System.out.println(minimumElement);

        int[] numbersEmpty = {};
        try {
            minimumElement(numbersEmpty);
        } catch (IllegalArgumentException e) {
            System.out.println("Cannot find minimal element, input is invalid");
        }
    }
}
