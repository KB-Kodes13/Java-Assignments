package objectsInList;

public class Animal {
    private String name;
    private boolean isADog;

    public Animal(String name, boolean isADog) {
        this.name = name;
        this.isADog = isADog;
    }
    public String getName() {
        return name;
    }
    public boolean isADog() {
        return isADog;
    }
    @Override
    public String toString() {
        return name + " is a dog = " + isADog;
    }

}