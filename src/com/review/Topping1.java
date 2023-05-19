package com.review;
import java.util.HashMap;
import java.util.Map;
public class Topping1 {
    public static Map<String, String> topping1(Map<String, String> toppingMap) {
        toppingMap.put("bread", "butter"); // Set the key "bread" to have the value "butter"

        if (toppingMap.containsKey("ice cream")) { // Checked if the key "ice cream" is present in the map
            toppingMap.put("ice cream", "cherry"); // Set the value of "ice cream" to "cherry"
        }

        return toppingMap; // Return the modified map
    }

    public static void main(String[] args) {
        // Test cases
        Map<String, String> toppingMap1 = new HashMap<>();
        toppingMap1.put("ice cream", "peanuts");
        System.out.println(topping1(toppingMap1)); // Output: {bread=butter, ice cream=cherry}

        Map<String, String> toppingMap2 = new HashMap<>();
        System.out.println(topping1(toppingMap2)); // Output: {bread=butter}

        Map<String, String> toppingMap3 = new HashMap<>();
        toppingMap3.put("pancake", "syrup");
        System.out.println(topping1(toppingMap3)); // Output: {bread=butter, pancake=syrup}
    }
}
