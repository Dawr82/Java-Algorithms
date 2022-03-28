package pl.dawid.problem27;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
//import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Algorithm27Test{

    char[] bracketsValid = {'{', '(','[', '(', ')', ']', ')', '}'};
    char[] bracketsInvalid = {'{', ']', '(', '{'};
    char[] bracketsInvalidTokens = {'(', 'H', '}', ')'};

    @Test
    @DisplayName("Should throw IllegalArgumentException if input array contains invalid tokens.")
    public void testThrowsCheckBrackets(){
        assertThrows(IllegalArgumentException.class, () -> Algorithm27.checkBrackets(bracketsInvalidTokens));
        assertDoesNotThrow(() -> Algorithm27.checkBrackets(bracketsInvalid));
        assertDoesNotThrow(() -> Algorithm27.checkBrackets(bracketsValid));
    }

    @Test
    @DisplayName("[1] Should evaluate to true/false if brackets are/aren't arranged correctly.")
    public void testCheckBrackets(){
        assertFalse(Algorithm27.checkBrackets(bracketsInvalid));
        assertTrue(Algorithm27.checkBrackets(bracketsValid));
        assertFalse(Algorithm27.checkBrackets(new char[]{'(', ')', ')'}));
    }

    @Test
    @DisplayName("[2] Should evaluate to true/false if brackets are/aren't arranged correctly.")
    public void testCheckBrackets1(){
        assertFalse(Algorithm27.checkBrackets1(bracketsInvalid));
        assertTrue(Algorithm27.checkBrackets1(bracketsValid));
    }
}
