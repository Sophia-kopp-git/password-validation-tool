package org.example;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class PasswordGenerator {
    public static String generateValidPassword() {
        String validPassword = "";
        validPassword += generateString().toUpperCase();
        validPassword += generateString().toLowerCase();
        validPassword += generateNumber();
        validPassword += generateSpecialCharacter();
        return validPassword;
    }

    protected static String generateString() {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String str = "";

        for(int i = 0; i <2; i++){
            str += "" + alphabet.charAt((int)Math.floor(Math.random()*alphabet.length()));
        }
        return str;
    }

    protected static String generateNumber() {
        String str = "";
        for (int i = 0; i < 4; i++) {
            str += String.valueOf((int)Math.floor((Math.random()*9)));
        }
        return str;
    }
    protected static String generateSpecialCharacter() {
        String[] specialCharList = {"!", "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "_", "+", "=", "?", ".", ",", ";", ":"};
        String str = specialCharList[(int)(Math.floor(Math.random()*specialCharList.length))-1];
        return str;
    }
}
