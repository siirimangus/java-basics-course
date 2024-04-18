package arraysloops;

public class Loops {
    public static void printNumbersFor() {
        // number++ => number = number + 1
        // quick setup: fori + Tab
        for (int number = 1; number <= 10; number++) {
            System.out.println(number);
        }
    }

    public static void printNumbersWhile() {
        int number = 1;
        while (number <= 10) {
            System.out.println(number);
            number++;
        }
    }

    public static void printNumbersForEach() {
        // quick setup: iter + Tab
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static void printCharacters(String text) {
        int textLength = text.length();
        for (int i = 0; i < textLength; i++) {
            System.out.println("Character: " + text.charAt(i));
        }
    }

    public static void printCharactersForEach(String text) {
        char[] characters = text.toCharArray();

        for (char character : characters) {
            System.out.println("Character: " + character);
        }
    }

    public static void printEvenNumbers() {
        for (int i = 0; i <= 36 ; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // i += 2 => i = i + 2
        for (int i = 0; i <= 36 ; i += 2) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        printNumbersForEach();

        printCharactersForEach("hello");

        printEvenNumbers();
    }
}
