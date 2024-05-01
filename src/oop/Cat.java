package oop;

import java.util.Objects;

public class Cat {
    private String name;
    private String owner;

    public Cat(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    public void roll() {
        System.out.println("*rolling*");
    }

    public void greet() {
        System.out.println("meow!");
    }

    public void speak() {
        System.out.println("I cannot!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Cat cat = (Cat) o;

        return Objects.equals(name, cat.name) && Objects.equals(owner, cat.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, owner);
    }

    @Override
    public String toString() {
        return String.format("Cat named %s with owner %s", name, owner);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }
}
