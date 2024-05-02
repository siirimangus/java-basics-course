package inheritance.animal;

public class Dolphin extends Animal {
    private boolean isPlayful;
    private boolean isSmart;

    public Dolphin(String name, boolean isPlayful, boolean isSmart) {
        super(name, false);

        this.isPlayful = isPlayful;
        this.isSmart = isSmart;
    }

    @Override
    public void speak() {
        System.out.println("*water splash*");
    }

    @Override
    public boolean isFriendly() {
        return isSmart || isPlayful;
    }

    public void performJump() {
        if (isPlayful) {
            System.out.println("*Jumps*");
        } else if (isSmart) {
            System.out.println("I will jump.. for food.");
        } else {
            System.out.println("No");
        }
    }
}
