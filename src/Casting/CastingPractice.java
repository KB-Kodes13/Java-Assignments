package Casting;

public class CastingPractice {
    public static void main(String[] args) {
        double myDouble = 112.35;
        int myInt =(int) myDouble;
        String myString = "49";
        int stringToInt = Integer.parseInt(myString);

        System.out.println("Double: " + myDouble);
        System.out.println("Int: " + myInt);
        System.out.println("The string value is: " + stringToInt);
        System.out.println("The integer value is: " + myString);
    }
}
