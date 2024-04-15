package methods;

public class Methods {
    public static void printGreeting(String name) {
        System.out.println("Good day, " + name + "!");
        System.out.format("Good day, %s!%n", name);
        System.out.printf("Good day, %s!%n", name);
    }

    public static void printSum(double a, double b) {
        System.out.println(a + b);
    }

    public static double getSum(double a, double b) {
        return a + b;
    }

    public static double calculateTriangleArea(double height, double base) {
        return (height * base) / 2;
    }

    public static double calculateCircleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static double calculateRectangleArea(double width, double height) {
        return width * height;
    }

    public static void main(String[] args) {
        printGreeting("Siiri");

        printSum(5.3, 3.2);

        double sum = getSum(2.0, 4.6);
        System.out.println(sum);

        double sum1 = getSum(9981, 44489);
        double sum2 = getSum(3349, 10992);
        double result = sum1 / sum2;
        System.out.println(result);

        System.out.println(calculateTriangleArea(3.4, 6.7));

        System.out.println(calculateCircleArea(3.2));

        System.out.println(calculateRectangleArea(2.0, 4.0));
    }
}
