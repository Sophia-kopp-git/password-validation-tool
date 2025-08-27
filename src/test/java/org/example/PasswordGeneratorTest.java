package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordGeneratorTest {

    @Test
    void generateValidPassword() {
    }

    @Test
    void generateStringInUpperCase() {
        int expectedLength = 2;
        String actual = PasswordGenerator.generateString();
        assertEquals(expectedLength, actual.length());
    }

    @Test
    void generateNumber() {
    }

    @Test
    void generateSpecialCharacter() {
    }
}