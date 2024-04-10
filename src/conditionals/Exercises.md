# Conditional statement exercises

---

Create a new package `conditionals` in the `src` folder.

## EX 1 - If-else, switch

Create a class `Conditionals` with the main method in the `conditionals` package. In this method you will start checking you method calls.

1. Define a method which takes in a parameter, `void displayWeatherDescription(double currentTemperature)`.
   If the passed argument is bigger than 15, print `It is warm outside!`,
   if it is less than 15 but bigger than 0 - `It is chill outside!`
   and in other cases print `It is freezing outside!`
2. Define a method which takes in a parameter, `String task`.
   Depending on a task, print respective message to the console:
* `STUDY` -> `It is time to study!`
* `WORK` -> `I will grab my coffee first...`
* `REST` -> `You don't have to tell me twice`
  If there is no match, print `Don't know what to do`.
  Solve the exercise with both `if-else` and `switch` constructs.
3. Define a method `isDivisible` which takes in two parameters, `int number, int divisor`.
   The method should check if the `number` is divisible by the parameter `divisor`.
   If yes, print `Number X is divisible by Y!`, in other case print `Number X is not divisible by Y!`.
   Don't forget to handle division by zero!
4. Define a method `boolean isGoodWeather(boolean isRainy, boolean isWarm, boolean isWindy, boolean isSunny)`
   If it is sunny and warm, return `true`.
   If it is not windy, and it is not raining, return `true`.
   In other cases return `false`.
5. Define a method `byte getWeekdayNumber(String weekDay)`, which returns a number for a corresponding weekday (e.g. monday - 1, tuesday - 2 etc.). Use switch statement.
   Example: `System.out.println(getWeekdayNumber("monday"))` should print out `1`,
   `System.out.println(getWeekdayNumber("sunday"))` should print out `7`.
6. Define a method `String compare(double number)` that behaves like this:
- If the number is bigger than 5, return "The input number is bigger than 5!"
- If the input number is smaller than 5, return "The input number is smaller than 5!"
- If the input number is 5, return "The input number is 5!"

## EX 2 - String processing, logic

Create a class `StringConditionals` with the main method in the `conditionals` package. In this method you will start checking you method calls.

1. Define a method `greet` which takes in a parameter `String name`, e.g. "Bob", return a greeting of the form "Hello Bob!".
```
greet("Bob") → "Hello Bob!"
greet("Alice") → "Hello Alice!"
```

2. Define a method `extraEnd`, which takes in a parameter `String str` and returns a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.
```
extraEnd("Hello") → "lololo"
extraEnd("ab") → "ababab"
extraEnd("Hi") → "HiHiHi"
```

3. Your cell phone rings. Return true if you should answer it. Normally you answer, except in the morning you only answer if it is your mom calling. In all cases, if you are asleep, you do not answer.
```
answerCell(boolean isMorning, boolean isMom, boolean isAsleep)
answerCell(false, false, false) → true
answerCell(false, false, true) → false
answerCell(true, false, false) → false
```

4. Given three integers, a b c, return true if two or more of them have the same rightmost digit. The integers are non-negative. Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.

```
lastDigit(23, 19, 13) → true
lastDigit(23, 19, 12) → false
lastDigit(23, 19, 3) → true
```

5. Given a string str, if the string starts with "f" return "Fizz". If the string ends with "b" return "Buzz". If both the "f" and "b" conditions are true, return "FizzBuzz". In all other cases, return the string unchanged. (See also: FizzBuzz Code)

```
fizzString(String str)
fizzString("fig") → "Fizz"
fizzString("dib") → "Buzz"
fizzString("fib") → "FizzBuzz"
```