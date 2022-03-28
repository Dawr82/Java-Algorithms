package pl.dawid.problem18;

import org.junit.jupiter.api.Test;
//import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Algorithm18Test {

    Integer[] numbers = {10, 5, 2, 7, 8, 7};

    @Test
    public void shouldEqualTo() throws InvalidSubarraySize {
        assertArrayEquals(Algorithm18.maxOfSubarray(numbers, 3), new int[]{10, 7, 8, 8});
        assertArrayEquals(Algorithm18.maxOfSubarray(numbers, 2), new int[]{10, 5, 7, 8, 8});
        assertArrayEquals(Algorithm18.maxOfSubarray(numbers, numbers.length), new int[]{10});
    }

    @Test
    public void shouldThrow(){
        assertThrows(InvalidSubarraySize.class, () -> Algorithm18.maxOfSubarray(numbers, 0));
        assertThrows(InvalidSubarraySize.class, () -> Algorithm18.maxOfSubarray(numbers, -1));
        assertThrows(InvalidSubarraySize.class, () -> Algorithm18.maxOfSubarray(numbers, numbers.length + 1));
    }
}