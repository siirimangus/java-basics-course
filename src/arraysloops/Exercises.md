# Exercises about arrays and loops

---

Create a new package `arraysloops` in the `src` folder.

## EX 1 - Loops

Create a class `Loops` in this package.

1. Define a for loop which prints out numbers from 1 to 10.
2. Define a for loop which loops over a given string and prints all its characters by one like so: `Character: <character>`.
   For example, when given a string `abcd`, your program should print out the following:
```
Character: a
Character: b
Character: c
Character: d
```
3. Define a for loop which prints out even numbers until 36.

## EX 2 - Loops + Arrays

Create a class `ArraysAndsLoops` in this package.

1. Define an array which holds names of 3 fruits. Print the contents of the array.
2. Define a method `String[] deletefromArray(String[] array, String value)` which would delete value from the given array.
3. Define a method `boolean existsInArray(String[] array, String value)` which would check if the given value exists in the array.
4. Define a method `String[] addToArray(String[] array, String value, int index)` which adds a value to the specified array under the specified index.
5. Define an empty array of size 10, which will hold `char`. Populate the array with the characters `v`, `k`, `a`, `s`, `d`. Sort the array alphabetically.
6. Given an array of ints, return the sum of the first 2 elements in the array. If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.

```
sum2([1, 2, 3]) → 3
sum2([1, 1]) → 2
sum2([1, 1, 1, 1]) → 2
```

7. Given an array of ints, return true if the array contains no 1's and no 3's.

```
lucky13([0, 2, 4]) → true
lucky13([1, 2, 3]) → false
lucky13([1, 2, 4]) → false
```