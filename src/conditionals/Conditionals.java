package conditionals;

public class Conditionals {
    public static void displayWeatherDescription(double currentTemperature) {
        if (currentTemperature > 15) {
            System.out.println("It is warm outside!");
        } else if (currentTemperature > 0) {
            System.out.println("It is chill outside!");
        } else {
            System.out.println("It is freezing outside!");
        }
    }

    public static void takeAction(String task) {
        switch(task) {
            case "STUDY":
                System.out.println("It is time to study!");
                break;
            case "WORK":
                System.out.println("I will grab my coffee first...");
                break;
            case "REST":
                System.out.println("You don't have to tell me twice");
                break;
            default:
                System.out.println("Don't know what to do");
        }
    }

    public static void takeActionWithIfElse(String task) {
        if (task.equals("STUDY")) {
            System.out.println("It is time to study!");
        } else if (task.equals("WORK")) {
            System.out.println("I will grab my coffee first...");
        } else if (task.equals("REST")) {
            System.out.println("You don't have to tell me twice");
        } else {
            System.out.println("Don't know what to do");
        }
    }

    public static void isDivisible(int number, int divisor) {
        if (divisor == 0) {
            System.out.println("Cannot divide by zero!");
        } else if (number % divisor == 0) {
            System.out.printf("Number %d is divisible by %d!%n", number, divisor);
        } else {
            System.out.printf("Number %d is not divisible by %d!%n", number, divisor);
        }
    }

    // isDivisible a bit simplified version
    // after checking the value 0, we can return immediately
    // the keyword return in this case ends the function execution
    public static void isDivisibleSimplified(int number, int divisor) {
        if (divisor == 0) {
            System.out.println("Cannot divide by zero!");
            return;
        }

        if (number % divisor == 0) {
            System.out.printf("Number %d is divisible by %d!%n", number, divisor);
        } else {
            System.out.printf("Number %d is not divisible by %d!%n", number, divisor);
        }
    }

    // no need to use the if-else statement (but can be)
    // when the return keyword is used, the function stops further execution
    public static boolean isGoodWeather(boolean isRainy, boolean isWarm, boolean isWindy, boolean isSunny) {
        if (isSunny && isWarm) {
            return true;
        }

        return !isWindy && !isRainy;
    }

    public static byte getWeekdayNumber(String day) {
        switch(day) {
            case "monday":
                return 1; // here the break statement is not needed as the return already stops the execution
            case "tuesday":
                return 2;
            case "wednesday":
                return 3;
            case "thursday":
                return 4;
            case "friday":
                return 5;
            case "saturday":
                return 6;
            case "sunday":
                return 7;
            default:
                return -1; // added a default value to be some "broken" value, it is quite common to use -1 in case of errors
        }
    }

    public static String compare(double number) {
        if (number == 5) {
            return "The input number is 5!";
        }

        if (number > 5) {
            return "The input number is bigger than 5!";
        } else {
            return "The input number is smaller than 5!";
        }
    }

    public static void main(String[] args) {
        displayWeatherDescription(18);
        displayWeatherDescription(12);
        displayWeatherDescription(-7.8);

        takeAction("WORK");
        takeAction("SLEEP");

        takeActionWithIfElse("WORK");
        takeActionWithIfElse("REST");

        isDivisible(10, 0);
        isDivisible(10, 5);
        isDivisible(10, 3);

        isDivisibleSimplified(10, 0);
        isDivisibleSimplified(10, 5);
        isDivisibleSimplified(10, 3);

        boolean weather1 = isGoodWeather(true, true, true, false);
        boolean weather2 = isGoodWeather(false, true, false, true);
        System.out.println(weather1);
        System.out.println(weather2);

        System.out.println(getWeekdayNumber("wednesday"));
        System.out.println(getWeekdayNumber("random"));

        System.out.println(compare(1));
        System.out.println(compare(5));
        System.out.println(compare(8));
    }
}
