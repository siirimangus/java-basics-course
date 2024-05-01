# Exercises about abstract classes and interfaces

Create package `inheritance` under the `src` folder. All the packages mentioned in the tasks, should be created
under the `inheritance` package.

---

## EX 1 - abstract classes and inheritance

1. Create a class called `Employee` with the constructor `Employee(int salary)`, private field `salary`,
and methods called `work()` and `getSalary()`. Create a subclass called HRManager that overrides the `work()` method
and adds a new method called `addEmployee()`.

2. Create a package `animal`. Inside it, create an abstract class `Animal` with the following methods and constructor:
```
public abstract void speak()
public void greet()  -- prints '{name} greets you!'
public boolean isFriendly() -- returns `isPet`
public String getName() -- returns pet name
public String toString() -- returns pet name and whether it is friendly

Animal(String name, boolean isPet)
```

3. Define class `Dog` which extends `Animal` with the following methods (constructor is the same):
```
public void roll() -- print "**rolling**"
public void speak() -- print "Bark!"
```

4. Define class `Dolphin` which extends `Animal` with the following methods and constructor:

```
public boolean isFriendly() -- smart or playful
public void speak() -- "*water splash*"
public void performJump() -- if playful, print "*Jumps*". If smart, print "I will jump.. for food.".  In other cases print "No.".

public Dolphin(String name, boolean isPlayful, boolean isSmart)
```

5. Create different animal objects and call the methods.


## EX 2 - interfaces

1. Create an interface `Flyable` with a method called `fly_obj()`.
Create three classes `Spacecraft`, `Airplane`, and `Helicopter` that implement the `Flyable` interface.
Implement the `fly_obj()` method for each of the three classes. \
Solution: https://www.w3resource.com/java-exercises/java-interface-exercise-3.php

2. Create an interface `Shape` with the `getArea()` method.
Create three classes `Rectangle`, `Circle`, and `Triangle` that implement the `Shape` interface.
Implement the `getArea()` method for each of the three classes. \
Solution: https://www.w3resource.com/java-exercises/java-interface-exercise-1.php


## EX 3 - enums

1. Create an enum called `DaysOfWeek` representing the days of week. Print out weekday `Thursday`.
2. Create an enum called `Direction` with constants representing the cardinal directions (North, South, East, West).
Print out the direction West.



