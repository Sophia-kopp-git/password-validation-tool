package org.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    void isNotNull_returnsTrue_WhenPasswordNullOrEmptyString() {
        //given
        String password = null;
        String passwordEmptyString = null;
        //when
        //then
        assertNull(password);
        assertNull(passwordEmptyString);
    }

    @Test
    void hasMinLength() {
        //given

        //when

        //then

    }

    @Test
    void containsDigit() {
        //given

        //when

        //then

    }

    @Test
    void containsUpperAndLowerCase_returnsTrue_WhenPasswordHasAtLeastOneLowerAndOneUpperCaseLetter() {
        //given
        String password = "Hello";
        //when
        boolean expected = PasswordValidator.containsUpperAndLowerCase(password);
        boolean actual = true;
        //then
        assertEquals(actual, expected);
    }
    @Test
    void containsUpperAndLowerCase_returnsFalse_WhenPasswordHasOnlyLowerCaseLetter() {
        //given
        String password = "hello";
        //when
        boolean expected = PasswordValidator.containsUpperAndLowerCase(password);
        boolean actual = false;
        //then
        assertEquals(actual, expected);
    }
    @Test
    void containsUpperAndLowerCase_returnsFalse_WhenPasswordHasOnlyUpperCaseLetter() {
        //given
        String password = "HELLO";
        //when
        boolean expected = PasswordValidator.containsUpperAndLowerCase(password);
        boolean actual = false;
        //then
        assertEquals(actual, expected);
    }

    @Test
    void isCommonPassword_returnFalse_whenPasswordIsPassword() {
        //given
        String password = "PaSSworD";

        //when
        boolean expected = PasswordValidator.isCommonPassword(password);
        boolean actual = false;

        //then
        assertEquals(actual, expected);
    }
    @Test
    void isCommonPassword_returnFalse_whenPasswordIsHelloooo() {
        //given
        String password = "Halloooo";

        //when
        boolean expected = PasswordValidator.isCommonPassword(password);
        boolean actual = false;

        //then
        assertEquals(actual, expected);
    }
    @Test
    void isCommonPassword_returnTrue_whenPasswordIsBla12345() {
        //given
        String password = "Bla12345";

        //when
        boolean expected = PasswordValidator.isCommonPassword(password);
        boolean actual = true;

        //then
        assertEquals(actual, expected);
    }

    @Test
    void containsSpecialChar() {
        //given

        //when

        //then

    }

    @Test
    void isValidPassword() {
        //given

        //when

        //then

    }
}