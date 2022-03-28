package pl.dawid.problem2;

import org.junit.jupiter.api.Test;
//import org.junit.Test;
import pl.dawid.utils.Utilities;

import static org.junit.jupiter.api.Assertions.*;

public class Algorithm2Test {

    @Test
    public void testProductArray() {
        int[] numbers = {2, 1, 4, 7};
        Algorithm2.productArray(numbers);
        assertArrayEquals(numbers, new int[]{28, 56, 14, 8});
    }

    @Test
    public void testProductArrayExtended() {
        int[] numbers = {2, 1, 4, 7};
        assertArrayEquals(Algorithm2.productArrayExtended(numbers), new int[]{28, 56, 14, 8});
    }
}