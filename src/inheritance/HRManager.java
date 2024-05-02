package inheritance;

public class HRManager extends Employee {
    public HRManager(int salary) {
        super(salary);
    }

    @Override
    public void work() {
        System.out.println("I am a manager!");
    }

    public void addEmployee() {
        System.out.println("Adding an employee...");
    }
}
