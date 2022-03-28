package pl.dawid.problem1;

import java.util.Set;
import java.util.HashSet;

public class Algorithm1 {

    private Algorithm1(){};

    public static boolean checkSum(Integer[] array, int sum){
        Set<Integer> present = new HashSet<>();

        for(Integer number : array){
            if(present.contains(sum - number)){
                return true;
            }
            present.add(number);
        }

        return false;
    }
}
