package com.regex;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Regex {
    public static void main(String[] args) {

        // Email Validation
        String email = "java13@gmail.com";
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        validateInput(email, emailRegex, "Email");

        // Phone Number Validation
        String phoneNumber = "(912) 555-1313";
        String phoneRegex = "^\\(\\d{3}\\) \\d{3}-\\d{4}$";
        validateInput(phoneNumber, phoneRegex, "Phone Number");

        // Date Validation
        String date = "03/13/19985";//more than 4 digits in the year so it is not valid
        String dateRegex = "^\\d{2}/\\d{2}/\\d{4}$";
        validateInput(date, dateRegex, "Date");

        // URL Validation
        String url = "https://www.javalava.com";
        String urlRegex = "^(http|https)://[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        validateInput(url, urlRegex, "URL");

        // Credit Card Number Validation
        String creditCard = "1234-5678-9012-3456";
        String creditCardRegex = "^(\\d{4}-){3}\\d{4}$";
        validateInput(creditCard, creditCardRegex, "Credit Card");

        // US Zip Code Validation
        String zipCode = "31545-4041";
        String zipCodeRegex = "^\\d{5}(-\\d{4})?$";
        validateInput(zipCode, zipCodeRegex, "ZIP Code");

        // Java Identifier Validation
        String identifier = "my_validation13$";
        String identifierRegex = "^[A-Za-z_$][A-Za-z0-9_$]*$";
        validateInput(identifier, identifierRegex, "Java Identifier");

        // Hexadecimal Color Code Validation
        String colorCode = "#QFQfQk12"; // has more that 6 so it is not valid
        String colorCodeRegex = "^#([A-Fa-f0-9]{6})$";
        validateInput(colorCode, colorCodeRegex, "Hexadecimal Color Code");

        // Time Validation
        String time = "12:45";
        String timeRegex = "^([01]\\d|2[0-2]):[0-5]\\d$";
        validateInput(time, timeRegex, "Time");
    }

    private static void validateInput(String input, String regex, String patternName) {
        Pattern pattern = Pattern.compile(regex); // Compile the regex pattern
        Matcher matcher = pattern.matcher(input); // Create a matcher for the input string

        if (matcher.matches()) {
            System.out.println("The " + patternName + " is valid."); // Input matches the regex pattern
        } else {
            System.out.println("The " + patternName + " is invalid."); // Input does not match the regex pattern
        }
    }
}
