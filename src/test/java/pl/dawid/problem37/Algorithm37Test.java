package pl.dawid.problem37;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
//import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class Algorithm37Test {

    @Test
    @DisplayName("Should always return null.")
    public void testIfReturnsNull() {
        assertNull(Algorithm37.getSubsets(new HashSet<>(Arrays.asList(1, 2, 3)), new HashSet<>()));
    }

    @Test
    @DisplayName("Should fill set of subsets provided as second argument with subsets of set passed as first argument.")
    public void testIfEquals(){

        Set<Set<Integer>> validOutput = new HashSet<Set<Integer>>(Arrays.asList(
                new HashSet<>(Arrays.asList(1, 2)),
                new HashSet<>(Arrays.asList(1, 3)),
                new HashSet<>(Arrays.asList(3, 2)),
                new HashSet<>(Arrays.asList(1)),
                new HashSet<>(Arrays.asList(2)),
                new HashSet<>(Arrays.asList(3))
        ));

        Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Set<Integer>> subsets = new HashSet<>();
        Algorithm37.getSubsets(set, subsets);
        assertEquals(subsets, validOutput);

        Set<Character> set1 = new HashSet<>(Arrays.asList('a', 'b', 'c'));
        Set<Set<Character>> subsets1 = new HashSet<>();
        Set<Set<Character>> validOutput1 = new HashSet<Set<Character>>(Arrays.asList(
                new HashSet<>(Arrays.asList('a', 'b')),
                new HashSet<>(Arrays.asList('a', 'c')),
                new HashSet<>(Arrays.asList('b', 'c')),
                new HashSet<>(Arrays.asList('a')),
                new HashSet<>(Arrays.asList('b')),
                new HashSet<>(Arrays.asList('c'))
        ));
        Algorithm37.getSubsets(set1, subsets1);
        assertEquals(subsets1, validOutput1);
    }
}