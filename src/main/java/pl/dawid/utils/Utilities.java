package pl.dawid.utils;

import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.List;


public class Utilities{

    private Utilities(){}

    @FunctionalInterface
    public static interface Function<T, E, G>{
        public G apply(T t, E e);
    }

    public static <T> void swap(T[] array, int i, int j){
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static int product(int[] array){
        int product = 1;
        for(int number : array){
            product *= number;
        }
        return product;
    }

    public static double product(double[] array){
        double product = 1;
        for(double number : array){
            product *= number;
        }
        return product;
    }

    public static int product(List<Integer> numbers){
        Integer product = 1;
        for(Integer number : numbers){
            product *= number;
        }
        return product;
    }

    public static <T, E, G> long measureExecutionTime(Function<T, E, G> func, T arg1, E arg2){
        long startTime = System.nanoTime();
        func.apply(arg1, arg2);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static boolean containsOnlyLetters(String string){
        for(int i = 0; i < string.length(); ++i){
            if(!(Character.isLetter(string.charAt(i)))){
                return false;
            }
        }
        return true;
    }

    public static boolean isNumeric(String string){
        ParsePosition pos = new ParsePosition(0);
        NumberFormat.getInstance().parse(string, pos);
        return string.length() == pos.getIndex();
    }
}

