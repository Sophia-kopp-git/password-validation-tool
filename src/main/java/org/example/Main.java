package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi, please enter your password here");
        String password = scanner.next();
        if (PasswordValidator.isValidPassword(password)) {
            System.out.println("Your password is valid!");
        }

    }
}