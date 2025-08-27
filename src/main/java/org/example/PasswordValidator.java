package org.example;

public class PasswordValidator {
    public static boolean isValidPassword(String password) {
        password = password == null ? "" : password.trim();
        if (password.isEmpty()) {
            return false;
        }

        if (hasMinLength(password) &&
                containsDigit(password) &&
                containsUpperAndLowerCase(password) &&
                !isCommonPassword(password) &&
                containsSpecialChar(password)
        ) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean hasMinLength(String password) {
        return password.length() >= 8;
    }

    public static boolean containsDigit(String password) {
        boolean hasDigit = false;
        char[] charArray = password.toCharArray();

        for (char c : charArray) {
            if (Character.isDigit(c)) {
                hasDigit = true;
                break;
            }
        }
        return hasDigit;
    }

    public static boolean containsUpperAndLowerCase(String password) {
        if (password.toLowerCase().equals(password)) {
            return false;
        }
        if (password.toUpperCase().equals(password)) {
            return false;
        }
        return true;
    }

    public static boolean isCommonPassword(String password) {
        String[] commonPasswordList = {"Password",
                "Password1",
                "Password9",
                "12345678",
                "987654321",
                "Aa345678",
                "Halloooo"};
        for (String word : commonPasswordList) {
            if (word.equalsIgnoreCase(password)) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsSpecialChar(String password) {
        String[] specialCharList = {"!", "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "_", "+", "=", "?", ".", ",", ";", ":"};
        for (String specialChar : specialCharList) {

            if (password.contains(specialChar)) {
                return true;
            }
        }
        return false;
    }


}
