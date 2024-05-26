package org.password;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordCheckerTest {

    @Test
    void shouldReturnTrueForComplexPasswordWithDigitsAndSpecialChars() {
         assertTrue( PasswordChecker.checkPasswordComplexity("Password123!") );
    }

    @Test
    void shouldReturnFalseIfPasswordHasOnlyDigits () {
        assertFalse( PasswordChecker.checkPasswordComplexity("12345678"));
    }

    @Test
    void shouldReturnFalseIfPasswordHasNoSpecialChars () {
        assertFalse( PasswordChecker.checkPasswordComplexity("Password123"));
    }

    @Test
    void shouldReturnTrueIfPasswordLong () {
        assertTrue( PasswordChecker.checkPasswordComplexity("PasswordIsTooLong1234567890....."));
    }

    @Test
    void shouldReturnFalseIfPasswordIsShort () {
        assertFalse( PasswordChecker.checkPasswordComplexity("Pa1!") );
    }

    @Test
    void shouldReturnFalseIfPasswordHasOnlySpecialChars () {
        assertFalse( PasswordChecker.checkPasswordComplexity(".!@'<,.>?"));
    }

    @Test
    void shouldReturnFalseIfPasswordHasOnlyLetters () {
        assertFalse( PasswordChecker.checkPasswordComplexity("Password"));
    }
}
