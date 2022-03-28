package pl.dawid.problem2;

import pl.dawid.utils.Utilities;

public class Algorithm2 {

    private Algorithm2(){};

    public static void productArray(int[] array){
        int product = Utilities.product(array);
        for(int i = 0; i < array.length; ++i){
            array[i] = product / array[i];
        }
    }

    public static int[] productArrayExtended(int[] array){

        // O(n^2) !!

        int[] productArray = new int[array.length];

        for(int i = 0; i < array.length; ++i){
            productArray[i] = 1;
            for(int j = 0; j < array.length; ++j){
                if (i != j){
                    productArray[i] *= array[j];
                }
            }
        }
        return productArray;
    }
}
