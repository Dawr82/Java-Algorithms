package pl.dawid.problem1;

import org.junit.jupiter.api.Test;
//import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Algorithm1Test {

    @Test
    public void testCheckSum(){
        Integer[] numbers = {10, 15, 3, 7};
        assertTrue(Algorithm1.checkSum(numbers, 13));
        assertFalse(Algorithm1.checkSum(numbers, 72));
        assertFalse(Algorithm1.checkSum(numbers, 6));
    }
}