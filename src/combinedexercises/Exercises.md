# Exercises about conditionals, loops, collections and maps

Exercises are taken from this page: https://www.w3resource.com/java-exercises/index.php

There might be some modifications/additions to the exercises.
A link to the solution for exercises is added, but please do not look at it before you have tried
to solve the task yourself first ;)

---

1. Write a method that accepts an integer `n` and outputs a string in the format of `n + nn + nnn`. \
   Hint: Let's use the `System.out.printf` method here. \
   Solution: https://www.w3resource.com/java-exercises/basic/java-basic-exercise-44.php
```
5 -> 5 + 55 + 555
```

2. Write a method to compare two integer numbers. There should be three possible outputs: \
   a) Number1 is equal to number2. \
   b) Number1 is bigger than number2. \
   c) Number1 is smaller than number2.

3. Write a method that returns `true` in case the input array of integers contains element 4 or 7.
```
[ 5, 4, 10 ] -> true
[ 1, 2, 3, 8 ] -> false
[ 1, 2, 7, 8 ] -> true
```

4. Write a method to calculate the sum of two integers and return `true` if the sum is equal to a third integer. \
Solution: https://www.w3resource.com/java-exercises/basic/java-basic-exercise-52.php
```
5, 15, 10 -> true
```

5. Write a method to display the multiplication table of a given integer. \
Solution: https://www.w3resource.com/java-exercises/conditional-statement/java-conditional-statement-exercise-14.php
```
5 ->
5 X 0 = 0                                                                        
5 X 1 = 5                                                                        
5 X 2 = 10                                                                       
5 X 3 = 15                                                                       
5 X 4 = 20                                                                       
5 X 5 = 25
```

6. Write a method to reverse a string. \
Hint: use method `toCharArray()` and for loop with iterator `i--` \
Solution: https://www.w3resource.com/java-exercises/basic/java-basic-exercise-37.php
```
The quick brown fox -> xof nworb kciuq ehT
```

7. Write a method to print numbers between 1 and 100 divisible by 3, 5 and both. \
Solution: https://www.w3resource.com/java-exercises/basic/java-basic-exercise-50.php
```
Divided by 3:                                                          
3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39, 42, 45, 48, 51, 54, 57
, 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99,

Divided by 5:                                                          
5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90,
95,

Divided by 3 & 5:                                                      
15, 30, 45, 60, 75, 90,
```

8. Write a method that returns an array where the elements are the products of corresponding elements of two integer arrays. 
Return an empty array in case the two arrays are not of equal length. \
Solution: https://www.w3resource.com/java-exercises/basic/java-basic-exercise-83.php
```
[ 5, 4, 10 ], [ 1, 2, 3 ] -> [ 5, 8, 30 ]
```

9. Write a method to check if a given string has all distinct characters. \
Solution: https://www.w3resource.com/java-exercises/basic/java-basic-exercise-141.php
```
xyyz -> false
```

10. Write a method that accepts three integers and prints "increasing" if the numbers are in increasing order,
"decreasing" if the numbers are in decreasing order, and "Neither increasing or decreasing order" otherwise. \
Solution: https://www.w3resource.com/java-exercises/conditional-statement/java-conditional-statement-exercise-31.php
```
147 -> increasing
543 -> decreasing
324 -> Neither increasing or decreasing order
```

11. Write a method that takes three integers and prints the greatest number. \
Solution: https://www.w3resource.com/java-exercises/conditional-statement/java-conditional-statement-exercise-3.php
```
59, 23, 14 -> 59
```

12. Write a method to create and display a unique two-digit number (no repetitive numbers inside) using 1, 2, 3, 4. Also count how many two-digit numbers are there. \
Hint: Need to use nested loops. \
Solution: https://www.w3resource.com/java-exercises/basic/java-basic-exercise-39.php
```
12                                                      
13
14
21                                                      
...                                                                                             
41                                                      
42                                                      
Total number of the two-digit-number is 12.
```

13. Write a method to display the pattern like a right angle triangle with a number. \
Solution: https://www.w3resource.com/java-exercises/conditional-statement/java-conditional-statement-exercise-16.php
```
10 ->
1                                                                                
12                                                                               
123                                                                              
1234                                                                             
12345                                                                            
123456                                                                           
1234567                                                                          
12345678                                                                         
123456789                                                                        
12345678910
```

14. Write a method that would return a HashMap with keys `letter`, `number`, `space`, `other`, where you collect the count of letters, numbers,
spaces and other type of characters in a given string. \
Hint: methods needed are `toCharArray()`, `Character.isLetter(char)`, `Character.isNumber(char)`, `Character.isSpace(char)` \
Solution: https://www.w3resource.com/java-exercises/basic/java-basic-exercise-38.php
```
Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33 -> { letter: 23, number: 10, space: 9, other: 6 }
```