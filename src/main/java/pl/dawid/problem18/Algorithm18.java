package pl.dawid.problem18;

import java.util.Collections;
import java.util.Arrays;

public class Algorithm18 {

    private Algorithm18() {}

    public static int[] maxOfSubarray(Integer[] array, int k) throws InvalidSubarraySize{

        if (!(k > 0 && k <= array.length)){
            throw new InvalidSubarraySize(String.format("Subarray size should be in range of [%d %d]",k, array.length));
        }

        int[] maxArray = new int[array.length - k + 1];
        for(int i = 0; i < maxArray.length; ++i){
            maxArray[i] = Collections.max(Arrays.asList(array).subList(i, i + k));
        }
        return maxArray;
    }
}
