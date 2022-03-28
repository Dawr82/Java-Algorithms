package pl.dawid.problem35;

import java.util.Arrays;
import pl.dawid.utils.Utilities;

public class Algorithm35 {

    private Algorithm35(){};

    public static void segregateArray(Character[] array) throws IllegalArgumentException{
        int rCount = 0;
        int bCount = 0;
        for(int i = 0; i < array.length - bCount; ++i){
            switch(array[i]){
                case 'R':
                    if(i - rCount - 1 >= 0){
                        Utilities.swap(array, rCount, i);      
                    }
                    rCount++;
                    break;
                case 'G':
                    break;
                case 'B':
                    while (true){
                        if(array[array.length - bCount - 1] == 'B' && array.length - bCount - 1 != i){
                            bCount++;
                        }
                        break;
                    }
                    Utilities.swap(array, array.length - bCount - 1, i);
                    bCount++;
                    if (array[i] == 'R'){
                        if (i - rCount - 1 > 0){
                            Utilities.swap(array, rCount, i);
                        }
                        rCount++;
                    }
                    break;
                default:
                    throw new IllegalArgumentException("Input array contains invalid characters.");
            }
        }

    }
}
