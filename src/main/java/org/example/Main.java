package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean validPassword = false;

        System.out.println("Hi there!");
        while (!validPassword) {
            System.out.println("Please enter your password here: ");
            String password = scanner.next();


            if (PasswordValidator.isValidPassword(password)) {
                System.out.println("Your password is valid!");
                validPassword = true;
            } else {
                System.out.println("Your password is invalid! Chose another one");
                System.out.println("Make sure ... ");
                if (!PasswordValidator.containsSpecialChar(password)) {
                    System.out.println("- it has a special character");
                }
                if (!PasswordValidator.isCommonPassword(password)) {
                    System.out.println("- it is not a common password");
                }
                if (!PasswordValidator.containsUpperAndLowerCase(password)) {
                    System.out.println("- it contains at least one character in upper and lower case");
                }
                if (!PasswordValidator.containsDigit(password)) {
                    System.out.println("- it contains at least one digit");
                }
            }
            if (!PasswordValidator.hasMinLength(password)) {
                System.out.println("- it is at least 8 characters long");
            }
        }
    }
}