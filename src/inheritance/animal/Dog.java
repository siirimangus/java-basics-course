package inheritance.animal;

public class Dog extends Animal {
    public Dog(String name, boolean isPet) {
        super(name, isPet);
    }

    @Override
    public void speak() {
        System.out.println("Bark!");
    }

    public void roll() {
        System.out.println("**rolling**");
    }
}
