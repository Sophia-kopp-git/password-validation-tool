package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String selectedPassword = "";
        Scanner scanner = new Scanner(System.in);

        boolean validPassword = false;

        System.out.println("Hi there!");
        while (!validPassword) {
            System.out.println("Please enter your password here: ");
            String enteredPassword = scanner.next();


            if (PasswordValidator.isValidPassword(enteredPassword)) {
                System.out.println("Your password is valid!");
                selectedPassword = enteredPassword;
                validPassword = true;
            } else {
                System.out.println("Your password is invalid! Chose another one");
                System.out.println("Make sure ... ");
                if (!PasswordValidator.containsSpecialChar(enteredPassword)) {
                    System.out.println("- it has a special character");
                }
                if (PasswordValidator.isCommonPassword(enteredPassword)) {
                    System.out.println("- it is not a common password");
                }
                if (!PasswordValidator.containsUpperAndLowerCase(enteredPassword)) {
                    System.out.println("- it contains at least one character in upper and lower case");
                }
                if (!PasswordValidator.containsDigit(enteredPassword)) {
                    System.out.println("- it contains at least one digit");
                }


                if (!PasswordValidator.hasMinLength(enteredPassword)) {
                    System.out.println("- it is at least 8 characters long");
                }
                System.out.println("Do you want a password suggestion?");
                String answer = scanner.next();
                if (answer.toLowerCase().charAt(0) == 'y') {
                    String possiblePassword = PasswordGenerator.generateValidPassword();
                    System.out.println("A valid password could be: " + possiblePassword);
                    System.out.println("Do you want this do be your password?");
                    answer = scanner.next();
                    if (answer.toLowerCase().charAt(0) == 'y') {
                        selectedPassword = possiblePassword;
                        System.out.println("Your password is : " + selectedPassword);
                        System.out.println("You have a valid password now!");
                        validPassword = true;
                    }
                }
            }
        }
    }
}