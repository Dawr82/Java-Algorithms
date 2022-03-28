package pl.dawid.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
//import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UtilitiesTest {

    @Test
    public void testSwap() {
        Integer[] integers = {1, 2, 3, 4};
        Double[] doubles = {1.4, 6.7, 8.9, 3.4};
        String[] strings = {"Dawid", "Maciek", "Karolina", "Jan", "Wiktor", "Marek"};

        Utilities.swap(integers, 1, 2);
        Utilities.swap(doubles, 0, 1);
        Utilities.swap(strings, 2, 3);

        assertArrayEquals(integers, new Integer[]{1, 3, 2, 4});
        assertArrayEquals(doubles, new Double[]{6.7, 1.4, 8.9, 3.4});
        assertArrayEquals(strings, new String[]{"Dawid", "Maciek", "Jan", "Karolina", "Wiktor", "Marek"});
    }

    @Test
    public void testProductInt() {
        int[] numbers = {5, 1, 7, 8, 14};
        assertEquals(Utilities.product(numbers), 3920);
        assertEquals(Utilities.product(new int[]{}), 1);
    }

    @Test
    public void testProductDouble() {
        double[] numbers = {2.5, 6.7, 9.2};
        assertEquals(Utilities.product(numbers), 154.1);
        assertEquals(Utilities.product(new double[]{}), 1);
    }

    @Test
    public void testProductInt1() {
        List<Integer> numbers = Arrays.asList(5, 1, 7, 8, 14);
        assertEquals(Utilities.product(numbers), 3920);
        assertEquals(Utilities.product(new LinkedList<Integer>()), 1);
    }

    @Test
    public void testmeasureExecutionTime() {
//        Utilities.Function<Integer, Integer, Integer> f = (x, y) -> x * y + 2 * x + 2 * y;
//
//        long startTime = System.nanoTime();
//        long execTime = Utilities.measureExecutionTime(f, 2, 5);
//        long endTime = System.nanoTime();
    }

    @Test
    @DisplayName("Should evaluate to true/false if string doesn't/does contain chars that aren't letters.")
    public void testContainsOnlyLetters(){
        String validString = "FCDASGBEYRNYREBVVDScadcadCSAvFVDVWbrtwewgtb";
        String invalidString = "15faF14r51@%@%fadf@f%gq#@gD13vrvw";
        assertTrue(Utilities.containsOnlyLetters(validString));
        assertFalse(Utilities.containsOnlyLetters(invalidString));
    }

    @Test
    @DisplayName("Should return true only if string is a number.")
    public void testIsNumeric(){
        String numString = "1344562612";
        String notNumString = "ADF2g4g@GBbsfgab35";
        assertFalse(Utilities.isNumeric(notNumString));
        assertTrue(Utilities.isNumeric(numString));
    }
}