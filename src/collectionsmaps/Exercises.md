# Exercises about collections and maps

---

Create a new package `collectionsmaps` in the `src` folder.

## EX 1 - List + Set
Create a class `ListsAndSets` in this package.

1. Define an array list which holds names of 3 fruits. Print the contents of the array list.
2. Create an array list with values `1,1,2,3,4,4,5,6`. Convert it to set. Try adding duplicate records to the set, print its contents afterwards.
3. Given a list of integers, return a list where each integer is multiplied by 2.

```
doubling([1, 2, 3]) → [2, 4, 6]
doubling([6, 8, 6, 8, -1]) → [12, 16, 12, 16, -2]
doubling([]) → []
```

4. Given a list of integers, return a list of those numbers, omitting any that are between 13 and 19 inclusive.

```
noTeen([12, 13, 19, 20]) → [12, 20]
noTeen([1, 14, 1]) → [1, 1]
noTeen([15]) → []
```



## EX 2 - Map
Create a class `Maps` in this package.

1. Define a `HashMap` called `studentGrades` which holds student names and respective grades.\
    1.1 Add records to it.\
    1.2 Delete records from it.\
    1.3 Find a grade for specific student.
2. Iterate over the previously created `Map` and filter out students with grades >= 4.
   Save those students to the list `topPerformingStudents` and print it out.
3. Given a map of food keys and their topping values, modify and return the map as follows: if the key "ice cream" has a value, set that as the value for the key "yogurt" also. If the key "spinach" has a value, change that value to "nuts".

```
topping2({"ice cream": "cherry"}) → {"yogurt": "cherry", "ice cream": "cherry"}
topping2({"spinach": "dirt", "ice cream": "cherry"}) → {"yogurt": "cherry", "spinach": "nuts", "ice cream": "cherry"}
topping2({"yogurt": "salt"}) → {"yogurt": "salt"}
```

4. Modify and return the given map as follows: if exactly one of the keys "a" or "b" has a value in the map (but not both), set the other to have that same value in the map.

```
mapAB3({"a": "aaa", "c": "cake"}) → {"a": "aaa", "b": "aaa", "c": "cake"}
mapAB3({"b": "bbb", "c": "cake"}) → {"a": "bbb", "b": "bbb", "c": "cake"}
mapAB3({"a": "aaa", "b": "bbb", "c": "cake"}) → {"a": "aaa", "b": "bbb", "c": "cake"}
```

5. The classic word-count algorithm: given an array of strings, return a Map<String, Integer> with a key for each different string, with the value the number of times that string appears in the array.

```
wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
wordCount(["c", "c", "c", "c"]) → {"c": 4}
```

6. Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array, and the value is that string's length.

```
wordLen(["a", "bb", "a", "bb"]) → {"bb": 2, "a": 1}
wordLen(["this", "and", "that", "and"]) → {"that": 4, "and": 3, "this": 4}
wordLen(["code", "code", "code", "bug"]) → {"code": 4, "bug": 3}
```