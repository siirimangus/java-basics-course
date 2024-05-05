# Exercises about file input-output

Create a package `fileoperations` under the `src` folder.

---

1. Create a class `FileOperations`. Try the following: \
    1.1 Create and write to a file `test.txt` in this package. \
    1.2 Read and store this file content line by line in an array. \
    1.3. Find the longest word in this file using `Scanner` (hint: https://www.w3resource.com/java-exercises/io/java-io-exercise-18.php)
2. Create a class `BusTime` with constructor `BusTime(Integer hour, List<Integer> minutes)`. \
Create a class `BusRepository` with method `public List<BusTime> getBusTimes()` that would read the data from the `data/bus-times.txt`
and return the list of `BusTime`-s.