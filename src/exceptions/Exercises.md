# Exercises about exceptions

Create a package `exceptions` under the `src` folder.

---

1. Create a class `MinimumElement`. Define a method `public static int minimumElement(int[] integers)`
that would return the smallest element in the array. If the array is empty or null, throw an `IllegalArgumentException`.
2. Create a package `vowels`. \
   2.1 Define a custom exception class `NoVowelsException` that would extend `Exception` class. Constructor signature would be `public NoVowelsException(String message)`. \
   2.2 Create class `VowelCheck`. Define a method `public static void checkVowels(String text)` that takes a string as input and throws a `NoVowelsException` if the string does not contain vowels. \
Solution: https://www.w3resource.com/java-exercises/exception/java-exception-exercise-7.php
3. Create a package `duplicates`. \
   2.1 Define a custom exception class `DuplicateNumbersException` that would extend `Exception` class. Constructor signature would be `public DuplicateNumbersException(String message)`. \
   2.2 Create class `DuplicatesCheck`. Define a method `public static void checkDuplicates(List<Integer> numbers)` that takes a list of integers as input and throws a `DuplicateNumbersException` if any numbers are duplicates. \
   Solution: https://www.w3resource.com/java-exercises/exception/java-exception-exercise-6.php