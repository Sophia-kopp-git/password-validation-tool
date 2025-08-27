package org.example;

public class PasswordValidator {
    public static boolean isValidPassword(String password) {
        if (password == null || password.equals("")) {
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
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) == '1' ||
                    password.charAt(i) == '2' ||
                    password.charAt(i) == '3' ||
                    password.charAt(i) == '4' ||
                    password.charAt(i) == '5' ||
                    password.charAt(i) == '6' ||
                    password.charAt(i) == '7' ||
                    password.charAt(i) == '8' ||
                    password.charAt(i) == '9' ||
                    password.charAt(i) == '0'
            ) {
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
        char[] specialCharList = {'!','!','@','#','$','%','^','&','*','(',')','-','_','+','=','?','.',',',';',':'};
        for (char specialChar : specialCharList) {

            if (password.contains("" + specialChar)) {
                return true;
            }
        }
        return false;
    }


}
