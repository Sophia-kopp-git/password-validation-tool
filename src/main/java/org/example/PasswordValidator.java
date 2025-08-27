package org.example;

public class PasswordValidator {
    public static boolean isValidPassword(String password){
        if (password == null || password.equals("")){
            return false;
        }
        if (hasMinLength(password) &&
        containsDigit(password) &&
        containsUpperAndLowerCase(password) &&
        isCommonPassword(password)
        ) {
         return true;
        }
        return false;
    }

    public static boolean hasMinLength(String password){
        return password.length() >= 8;
    }
    public static boolean containsDigit(String password){
        for (int i = 0; i < password.length(); i++){
            if (password.charAt(i) == 1 ||
                    password.charAt(i) == 2 ||
                    password.charAt(i) == 3 ||
                    password.charAt(i) == 4 ||
                    password.charAt(i) == 5 ||
                    password.charAt(i) == 6 ||
                    password.charAt(i) == 7 ||
                    password.charAt(i) == 8 ||
                    password.charAt(i) == 9 ||
                    password.charAt(i) == 0
            ){
                return true;
            }
        }
        return false;
    }
    public static boolean containsUpperAndLowerCase(String password){
        if(password.toLowerCase().equals(password)){
            return false;
        }
        if(password.toUpperCase().equals(password)){
            return false;
        }
        return true;
    }
        public static boolean isCommonPassword(String password){
            String[] commonPasswordList= {"password",
                    "Passwort1",
                    "Passwort9",
                    "12345678",
                    "987654321",
                    "Aa345678",
                    "Halloooo"};
            for (String word : commonPasswordList){
                if (word.equalsIgnoreCase(password)){
                    return false;
                }
            }
            return true;
        }
        public static boolean containsSpecialChar(String password){
            return false;
        }


}
