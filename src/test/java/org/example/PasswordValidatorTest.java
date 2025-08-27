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
    void hasMinLength_returnsFalse_whenPasswordIsHello() {
        //given
        String password = "Hello";
        //when
        boolean expected = PasswordValidator.hasMinLength(password);
        boolean actual = false;
        //then
        assertEquals(actual, expected);
    }
    @Test
    void hasMinLength_returnsTrue_whenPasswordIsHello123888() {
        //given
        String password = "Hello123888";
        //when
        boolean expected = PasswordValidator.hasMinLength(password);
        boolean actual = true;
        //then
        assertEquals(actual, expected);
    }

    @Test
    void containsDigit_returnsFalse_WhenPasswordIsHello() {
        //given
        String password = "Hello";
        //when
        boolean expected = PasswordValidator.containsDigit(password);
        boolean actual = false;
        //then
        assertEquals(actual, expected);
    }
    @Test
    void containsDigit_returnsTrue_WhenPasswordIsHello1() {
        //given
        String password = "Hello1";
        //when
        boolean expected = PasswordValidator.containsDigit(password);
        boolean actual = true;
        //then
        assertEquals(actual, expected);
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
    void isCommonPassword_returnTrue_whenPasswordIsPassword() {
        //given
        String password = "PaSSworD";

        //when
        boolean expected = PasswordValidator.isCommonPassword(password);
        boolean actual = true;

        //then
        assertEquals(actual, expected);
    }

    @Test
    void isCommonPassword_returnTrue_whenPasswordIsHelloooo() {
        //given
        String password = "Halloooo";

        //when
        boolean expected = PasswordValidator.isCommonPassword(password);
        boolean actual = true;

        //then
        assertEquals(actual, expected);
    }

    @Test
    void isCommonPassword_returnFalse_whenPasswordIsBla12345() {
        //given
        String password = "Bla12345";

        //when
        boolean expected = PasswordValidator.isCommonPassword(password);
        boolean actual = false;

        //then
        assertEquals(actual, expected);
    }

    @Test
    void containsSpecialChar_returnsTrue_whenPasswordHasSpecialChar() {
        //given
        String password = "Bla12345!";

        //when
        boolean expected = PasswordValidator.containsSpecialChar(password);
        boolean actual = true;

        //then
        assertEquals(actual, expected);

    }
    @Test
    void containsSpecialChar_returnsFalse_whenPasswordHasNotSpecialChar() {
        //given
        String password = "Bla12345";

        //when
        boolean expected = PasswordValidator.containsSpecialChar(password);
        boolean actual = false;

        //then
        assertEquals(actual, expected);

    }

    @Test
    void isValidPassword() {
        //given

        //when

        //then

    }
}