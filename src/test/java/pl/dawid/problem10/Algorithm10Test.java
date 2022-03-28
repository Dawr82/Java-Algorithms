package pl.dawid.problem10;

import org.junit.jupiter.api.Test;
//import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Algorithm10Test {

    @Test
    public void testExecuteTask() {
        int delay = 1000;

        long startTime = System.nanoTime();

        double result = Algorithm10.executeTask(x -> Math.pow(x, 2) + 4 * x + 4, 2, delay);

        long endTime = System.nanoTime();
        long execTime = endTime- startTime;

        assertEquals(result, 16);
        assertTrue(execTime > delay);
    }
}