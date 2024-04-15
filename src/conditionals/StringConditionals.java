package conditionals;

public class StringConditionals {
    public static String greet(String name) {
        return String.format("Hello %s!", name);
    }

    public static String extraEnd(String str) {
        // the last index of a string is: str.length() - 1
        // therefore the last but one index of a string is: str.length() - 2
        String lastTwoLetters = str.substring(str.length() - 2); // this will start from the last but one index until the end of the str

        // this is a new method repeat that will repeat the string as many times as specified
        return lastTwoLetters.repeat(3);
    }

    public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep) {
            return false;
        }

        return !isMorning || isMom;
    }

    // this is the simplified version, let's assume the numbers have only 2 digits
    public static boolean lastDigit(int a, int b, int c) {
        int remainderA = a % 10;
        int remainderB = b % 10;
        int remainderC = c % 10;

        return remainderA == remainderB || remainderA == remainderC || remainderB == remainderC;
    }

    public static String fizzString(String str) {
        char firstLetter = str.charAt(0);
        char lastLetter = str.charAt(str.length() - 1);

        if (firstLetter == 'f' && lastLetter == 'b') {
            return "FizzBuzz";
        }

        if (firstLetter == 'f') {
            return "Fizz";
        }

        if (lastLetter == 'b') {
            return "Buzz";
        }

        return str;
    }

    public static void main(String[] args) {
        System.out.println(greet("Bob"));

        System.out.println(extraEnd("Hello"));
        System.out.println(extraEnd("ab"));
        System.out.println(extraEnd("Hi"));

        System.out.println(answerCell(false, false, false));
        System.out.println(answerCell(false, false, true));
        System.out.println(answerCell(true, false, false));

        System.out.println(lastDigit(23, 19, 13));
        System.out.println(lastDigit(23, 19, 12));
        System.out.println(lastDigit(23, 13, 3));

        System.out.println(fizzString("fig"));
        System.out.println(fizzString("dib"));
        System.out.println(fizzString("fib"));
    }
}
