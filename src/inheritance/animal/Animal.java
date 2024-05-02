package inheritance.animal;

public abstract class Animal {
    private String name;
    private boolean isPet;

    public Animal(String name, boolean isPet) {
        this.name = name;
        this.isPet = isPet;
    }

    public abstract void speak();

    public void greet() {
        System.out.println(name + " greets you!");
    }

    public boolean isFriendly() {
        return isPet;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        String isFriendly;

        if (isFriendly()) {
            isFriendly = "is friendly";
        } else {
            isFriendly = "is not friendly";
        }

        return "Animal named " + name + " " + isFriendly;
    }
}
