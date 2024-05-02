package inheritance;

import inheritance.animal.Dog;
import inheritance.animal.Dolphin;

public class Main {
    public static void main(String[] args) {
        // Exercise 1 - 1
        HRManager manager = new HRManager(1000);
        manager.work();
        int salary = manager.getSalary();
        System.out.println(salary);

        Employee employee = new Employee(1200);
        employee.work();

        Employee manager1 = new HRManager(100);
        // manager1.addEmployee(); <- does not work because Employee class dos not have this method

        Employee employee1 = new Employee(10);
        // The next casting won't work, you'll run into ClassCastException because
        // employee1 is a class that is not an instance of HRManager (it is an instance of Employee):
        // HRManager manager2 = (HRManager) employee1;
        // manager2.addEmployee();

        // But this will work, for example, because employee2 is an instance of HRManager:
        Employee employee2 = new HRManager(1);
        HRManager manager3 = (HRManager) employee2;

        // The reason, the cast might fail, can be traced to an attempt at
        // downcasting an object to a class of which it is not an instance,
        // or to an interface which it does not implement.
        // https://rollbar.com/blog/java-classcastexception/

        // Exercise 1 - 2
        // Notice here that an import statement is needed at the beginning of this file
        // to indicate the package where those classes are coming from.
        // Let IDE do the import for you!
        Dog dog = new Dog("Muki", true);
        dog.roll();
        dog.speak();
        dog.greet();
        String dogAsString = dog.toString();
        System.out.println(dogAsString);
        System.out.println(dog.isFriendly());
        System.out.println(dog.getName());

        Dolphin dolphin = new Dolphin("Waka", true, false);
        dolphin.greet();
        dolphin.performJump();
        dolphin.speak();
        String dolphinAsString = dolphin.toString();
        System.out.println(dolphinAsString);
        System.out.println(dolphin.isFriendly());
        System.out.println(dolphin.getName());

        // Exercise 2 - 1
        Airplane airplane = new Airplane();
        airplane.fly_obj();

        Spacecraft spacecraft = new Spacecraft();
        spacecraft.fly_obj();

        Helicopter helicopter = new Helicopter();
        helicopter.fly_obj();

        // Exercise 2 -2
        Rectangle rectangle = new Rectangle(2.3, 5);
        System.out.println(rectangle.getArea());

        Circle circle = new Circle(6.7);
        System.out.println(circle.getArea());

        Triangle triangle = new Triangle(4, 9);
        System.out.println(triangle.getArea());

        // Exercise 3 - 1, 2
        System.out.println(DaysOfWeek.THURSDAY);
        System.out.println(Direction.WEST);
    }
}
