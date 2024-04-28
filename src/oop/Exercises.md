# Exercises about classes and objects

Create a package `oop` under the `src` folder.

1. Create a class called `Cat` which simulates a "usual" cat:
```
Cat(String name, String owner)

void roll() -- prints "*rolling*"
void greet() -- print "meow!"
void speak() -- print "I cannot!"
String getName() -- returns cat name
String setName() -- sets cat name
String getOwner() -- returns owner name
```

Override the `equals`, `hashCode` and `toString` methods.
```
String toString() -- "Cat named {name} with owner {owner}"
```

2. Create a class called `Student`, which simulates a usual student:
```
Student(String name, String university, boolean isLazy)

String getName() -- get student name
String setName() -- set student name
boolean setIsLazy() -- set laziness
boolean getIsLazy() -- get laziness
void doHomework() -- if student is lazy, prints "Homework? I have TV shows to watch." Otherwise prints "homework is done".
void switchUniversity(String school) -- Prints "{student name} leaves {current university} and starts studying in {new university}" and changes the `university` value.
String toString() -- returns a string "{student name}, {student university}"
```