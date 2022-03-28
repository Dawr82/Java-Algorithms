package pl.dawid.problem292;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
//import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Algorithm292Test {

    int[] weights = {50, 70, 80, 45, 110, 130, 60};

    @Test
    @DisplayName("Should throw IllegalArgumentException if any of arguments is equal or greater than 0.")
    public void testIfThrowsCalculateNumberOfBoats() {
        int[] invalidWeights = {-1, 70, 50, -130};

        assertThrows(IllegalArgumentException.class, () -> Algorithm292.calculateNumberOfBoats(invalidWeights, 200, 2));
        assertThrows(IllegalArgumentException.class, () -> Algorithm292.calculateNumberOfBoats(weights, -40, 2));
        assertThrows(IllegalArgumentException.class, () -> Algorithm292.calculateNumberOfBoats(weights, 200, 0));
        assertThrows(IllegalArgumentException.class, () -> Algorithm292.calculateNumberOfBoats(invalidWeights, -300, -10));
        assertThrows(IllegalArgumentException.class, () -> Algorithm292.calculateNumberOfBoats(new int[]{}, -300, -10));
    }

    @Test
    @DisplayName("Should return valid number of needed boats.")
    public void testIfEqualsCalculaterNumberOfBoats(){
        assertEquals(Algorithm292.calculateNumberOfBoats(weights, 150, 3), 5);
        assertEquals(Algorithm292.calculateNumberOfBoats(weights, 100, 2), 5);
    }
}