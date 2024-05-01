package oop;

public class Student {
    private String name;
    private String university;
    private boolean isLazy;

    public Student(String name, String university, boolean isLazy) {
        this.name = name;
        this.university = university;
        this.isLazy = isLazy;
    }

    public void doHomework() {
        if (isLazy) {
            System.out.println("Homework? I have TV shows to watch.");
        } else {
            System.out.println("Homework is done");
        }
    }

    public void switchUniversity(String school) {
        System.out.printf(String.format("%s leaves %s and starts studying in %s%n", name, university, school));
        this.university = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isLazy() {
        return isLazy;
    }

    public void setLazy(boolean lazy) {
        isLazy = lazy;
    }
}
