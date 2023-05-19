package com.review;

public class CigarParty {
    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend) {
            return cigars >= 40; // If it's the weekend, the party is successful if there are at least 40 cigars
        } else {
            return cigars >= 40 && cigars <= 60; // If it's not the weekend, the party is successful if there are between 40 and 60 cigars
        }
    }

    public static void main(String[] args) {
        System.out.println(cigarParty(30, false)); // Output: will be false
        System.out.println(cigarParty(50, false)); // Output: will be true
        System.out.println(cigarParty(70, true)); // Output: will be true
    }
}
