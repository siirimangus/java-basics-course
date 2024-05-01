package oop;

public class Main {
    public static void main(String[] args) {
        // Exercise 1
        Circle circle = new Circle();
        circle.setRadius(3.5);
        double radius = circle.getRadius();
        double area = circle.calculateArea();
        double perimeter = circle.calculatePerimeter();
        System.out.printf("Circle with radius %s has area %s and perimeter %s%n", radius, area, perimeter);

        // Exercise 2
        Cat cat = new Cat("Miisu", "Liisu");
        cat.roll();
        cat.greet();
        cat.speak();
        System.out.println(cat);

        Cat cat1 = new Cat("Miisu", "Liisu");
        Cat cat2 = new Cat("Miisu", "Liisu");
        boolean areCatsEqual = cat1.equals(cat2);
        System.out.println(areCatsEqual);

        // Exercise 3
        Student student = new Student("Mati", "BCS University", true);
        student.doHomework();
        student.switchUniversity("New school");
    }
}
