package inheritance;

public class Employee {
    private int salary;

    public Employee(int salary) {
        this.salary = salary;
    }

    public void work() {
        System.out.println("I am working");
    }

    public int getSalary() {
        return this.salary;
    }
}
