package pl.dawid.problem29;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
//import org.junit.Test;

import pl.dawid.problem27.Algorithm27;

import static org.junit.jupiter.api.Assertions.*;

public class Algorithm29Test {

    String validString = "AAABBVCBAAbhnbbbjkkkl";
    String invalidString = "aDF@g%q#hb$#^yhFSAGBVWgh#^$h$hbg@g$42524G2gv%#@G3G";
    String validEncoded = "3A2B1V1C1B2A1b1h1n3b1j3k1l";

    @Test
    @DisplayName("Should evaluate to true/false if string is/isn't encoded properly.")
    public void testIfIsEncoded(){
        String numericString = "352653277";
        String string1 = "A3F4G7A";
        String string2 = "1%7&5^9#";

        assertTrue(Algorithm29.isEncoded(validEncoded));
        assertFalse(Algorithm29.isEncoded(validString));
        assertFalse(Algorithm29.isEncoded(invalidString));
        assertFalse(Algorithm29.isEncoded(numericString));
        assertFalse(Algorithm29.isEncoded(string1));
        assertFalse(Algorithm29.isEncoded(string2));
    }

    @Test
    @DisplayName("Should throw IllegalArgumentException if invalid string is passed.")
    public void testIfThrowsEncodeString() {
        assertThrows(EncodingException.class, () -> Algorithm29.encodeString(invalidString));
        assertDoesNotThrow(() -> Algorithm29.encodeString(validString));
    }

    @Test
    @DisplayName("Should return a proper encoded version of input string.")
    public void testIfEqualsEncodeString() throws EncodingException{
        assertEquals(Algorithm29.encodeString(validString), validEncoded);
    }

    @Test
    @DisplayName("Should throw an exception if input string isn't properly encoded.")
    public void testIfThrowsDecodeString(){
        assertThrows(EncodingException.class, () -> Algorithm29.decodeString(invalidString));
        assertThrows(EncodingException.class, () -> Algorithm29.decodeString1(invalidString));
        assertThrows(EncodingException.class, () -> Algorithm29.decodeString2(invalidString));
    }

    @Test
    @DisplayName("Should return a valid decoded version of input string if input string is properly encoded.")
    public void testIfEqualsDecodeString() throws EncodingException {
        String validDecoded = validString;
        assertEquals(Algorithm29.decodeString(validEncoded), validDecoded);
        assertEquals(Algorithm29.decodeString1(validEncoded), validDecoded);
        assertEquals(Algorithm29.decodeString2(validEncoded), validDecoded);
    }
}