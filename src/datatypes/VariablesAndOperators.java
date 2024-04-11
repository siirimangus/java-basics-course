package datatypes;

public class VariablesAndOperators {
    public static void main(String[] args) {
        double randomNumber = 456.78;
        String test = "test";
        boolean isClean = true;
        char letter = 'a';
        String letterAsString = "a";
        int a = 5;
        int b = 91, c = 304, d = 405;
        float e = 56.7f, f = 45.8f, g = 91.2f;
        String sentence = "see on esimene väärtus";
        int h = 67;
        double i = 58.92;
        long bigNUmber = 7676868683452352376L;

        System.out.println(4 + 85);

        int j = 10;
        int k = 54;
        int sum = j + k;
        System.out.println(sum);

        int l = 81;
        int m = 10;
        int remainder = l % m;
        System.out.println(remainder);

        System.out.println(66 % 10);
        System.out.println(1000 % 10);

        int n = 15;
        int o = 4;
        double quotient = (double) n / o;
        System.out.println(quotient);

        double power = Math.pow(2, 5);
        System.out.println(power);

        char randomChar = 'a';
        System.out.println((int) randomChar);
        char anotherChar = 'b';
        System.out.println(randomChar == anotherChar);

        System.out.println(Double.MAX_VALUE);
    }
}
