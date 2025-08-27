package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordGeneratorTest {

    @Test
    void generateValidPassword() {
        String str = PasswordGenerator.generateValidPassword();
        boolean expected = true;
        boolean actual = PasswordValidator.isValidPassword(str);
        assertEquals(expected, actual);
    }

    @Test
    void generateString() {
        int expectedLength = 2;
        String actual = PasswordGenerator.generateString();
        assertEquals(expectedLength, actual.length());
    }

    @Test
    void generateNumber() {
        String passwordNum = PasswordGenerator.generateNumber();
        assertEquals(4, passwordNum.length());
        assertTrue(PasswordValidator.containsDigit(passwordNum));
    }

    @Test
    void generateSpecialCharacter() {
        String[] specialCharList = {"!", "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "_", "+", "=", "?", ".", ",", ";", ":"};
        String str = PasswordGenerator.generateSpecialCharacter();
        boolean expected = true;
        boolean actual = false;
        for (String specChar : specialCharList){
            if (specChar.equals(str)){
                actual = true;
                break;
            }
        }
        assertEquals(expected, actual);
    }
}