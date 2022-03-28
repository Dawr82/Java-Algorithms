package pl.dawid.problem35;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
//import org.junit.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class Algorithm35Test {

    @Test
    @DisplayName("Should throw IllegalArgumentException if input array contains illegal characters.")
    public void testIfThrowsSegregateArray() {
        Character[] invalidChars = {'R', 'J', 'G', 'G', 'L', 'B'};
        assertThrows(IllegalArgumentException.class, () -> Algorithm35.segregateArray(invalidChars));
        assertDoesNotThrow(() -> Algorithm35.segregateArray(new Character[]{'R', 'G', 'R', 'R', 'G', 'R', 'B', 'B', 'R', 'R', 'B', 'G'}));
    }

    @Test
    @DisplayName("Should return array with sorted values.")
    public void testIfEqualsSegregateArray(){

        Character[][] inputCharset = new Character[][]{
                {'R', 'G', 'R', 'R', 'G', 'R', 'B', 'B', 'R', 'R', 'B', 'G'},
                {'R', 'R', 'R', 'R'},
                {'G', 'G', 'G'},
                {'B', 'B', 'B', 'B'},
                {'R', 'R', 'G', 'G', 'R', 'G', 'R'},
                {'G', 'G', 'G', 'R', 'R', 'R'},
                {'B', 'R', 'B', 'R', 'B', 'R'},
                {'B', 'B', 'B', 'G', 'B', 'G'},
                {}
        };
        Character[][] outputCharset = new Character[][]{
                {'R', 'R', 'R', 'R', 'R', 'R', 'G', 'G', 'G', 'B', 'B', 'B'},
                {'R', 'R', 'R', 'R'},
                {'G', 'G', 'G'},
                {'B', 'B', 'B', 'B'},
                {'R', 'R', 'R', 'R', 'G', 'G', 'G'},
                {'R', 'R', 'R', 'G', 'G', 'G'},
                {'R', 'R', 'R', 'B', 'B', 'B'},
                {'G', 'G', 'B', 'B', 'B', 'B'},
                {}
        };

        for(int i = 0; i < inputCharset.length; ++i){
            Algorithm35.segregateArray(inputCharset[i]);
            assertArrayEquals(inputCharset[i], outputCharset[i]);
        }
    }
}