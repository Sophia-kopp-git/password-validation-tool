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
            }
        }
    }
}