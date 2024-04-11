package datatypes;

public class StringOperations {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Hello, \"World\"!");
        System.out.println("Steven Hawking once said: \"Life would be tragic if it weren't funny\".");
        System.out.println("When we concatenate strings " +
                "\"This is the first half \" and \"This is the second half\", " +
                "the result will be \"This is the first half This is the second half\".");
        System.out.println("Life is beautiful.");
        System.out.println("Life is 'beautiful'.");
        System.out.println("Life is \"beautiful\".");
        System.out.println("The most confusing part is using the \"-symbol inside the string.");
        System.out.println("'Three' - three, 'four' - four, \"five\" - five.");

        String word = "lightning";
        String result = word.substring(0, 3);
        System.out.println(result);

        String firstLetter = word.substring(0, 1); // here could also use the charAt method
        char fifthLetter = word.charAt(4);
        char secondLetter = word.charAt(1);

        System.out.println(firstLetter + fifthLetter + secondLetter);

        String name = "Siiri";

        // here %n adds a new line at the end of the sentence, and %s is the placeholder for variable "name"
        System.out.printf("Hello %s%n", name);

        String greeting = String.format("Hello %s", name);
        System.out.println(greeting);
    }
}