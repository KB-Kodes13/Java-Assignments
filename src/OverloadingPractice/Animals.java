package OverloadingPractice;

public class Animals {
    private String name;
    private boolean isADog;
    private int legs;
    private String hairColor;

    public Animals(String name, boolean isADog) {
        this.name = name;
        this.isADog = isADog;
    }
    public Animals(String name, boolean isADog, int legs, String hairColor) {
        this.name = name;
        this.isADog = isADog;
        this.legs = legs;
        this.hairColor = hairColor;
    }
    public String getName() {

        return name;
    }
    public boolean isADog() {

        return isADog;
    }

    public int getLegs() {
        return legs;
    }

    public String getHairColor() {
        return hairColor;
    }

    @Override
    public String toString() {

        return name + " is a dog = " + isADog + ", " + name + " has " + legs + " legs, and " + hairColor + " hair.";
    }
}
