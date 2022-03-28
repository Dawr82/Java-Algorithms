package pl.dawid;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

import pl.dawid.problem18.InvalidSubarraySize;
import pl.dawid.problem29.EncodingException;
import pl.dawid.utils.Utilities;
import pl.dawid.problem1.Algorithm1;
import pl.dawid.problem2.Algorithm2;
import pl.dawid.problem10.Algorithm10;
import pl.dawid.problem15.Algorithm15;
import pl.dawid.problem18.Algorithm18;
import pl.dawid.problem27.Algorithm27;
import pl.dawid.problem29.Algorithm29;
import pl.dawid.problem35.Algorithm35;
import pl.dawid.problem37.Algorithm37;
import pl.dawid.problem292.Algorithm292;


public class RunAlgorithms {

    private RunAlgorithms(){}

    private static String getMethodName(final int depth){
        final StackTraceElement[] stackElements = Thread.currentThread().getStackTrace();
        return stackElements[stackElements.length - 1 - depth].getMethodName();
    }

    private static void methodCallDelimiter(char delimiter, int length){
        System.out.println('\n'  + String.valueOf(delimiter).repeat(length) + '\n' + getMethodName(2) + '\n');
    }
    
    // Problem 15
    public static void runPickFromStream(){

        methodCallDelimiter('=', 50);

        Integer[] numbers = {3,4,5,6,7};
        
        Map<Integer, Integer> results = new HashMap<>();

        for(Integer number : numbers){
            results.put(number, 0);
        }

        for(int i = 0; i < 1_000_000; ++i){
            Integer picked = (Integer)Algorithm15.pickFromStream(numbers);
            Integer count = results.get(picked);
            results.put(picked, ++count);
        }

        for(Map.Entry<Integer, Integer> entry : results.entrySet()){
            System.out.printf("Number: %d Value: %d\n", entry.getKey(), entry.getValue());
        }
    }

    // Problem 18
    public static void runMaxOfSubarray(){

        methodCallDelimiter('=', 50);

        Integer[] numbers = {10, 5, 2, 7, 8 ,7};
        try {
            int[] maxNumbers = Algorithm18.maxOfSubarray(numbers, 3);
            System.out.println(Arrays.toString(maxNumbers));
        }
        catch(InvalidSubarraySize e){
            System.out.println(e);
        }
    }

    // Problem 35
    public static void runSegregateArray(){

        methodCallDelimiter('=', 50);

        Character[] chars = {'B', 'R', 'G', 'G', 'R', 'R', 'B', 'R', 'G', 'R'};
        Algorithm35.segregateArray(chars);
        System.out.println(Arrays.toString(chars));
    }

    // Problem 1
    public static void runCheckSum(){

        methodCallDelimiter('=', 50);

        Integer[] numbers = {10, 15, 3, 7};
        boolean isPresent = Algorithm1.checkSum(numbers, 17);
        System.out.println(isPresent);
    }

    // Problem 2
    public static void runProductArray(){

        methodCallDelimiter('=', 50);

        int[] numbers = {1, 2, 3, 4, 5};
        Algorithm2.productArray(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void runProductArrayExtended(){

        methodCallDelimiter('=', 50);

        int[] numbers = {1, 2, 3, 4, 5};
        int[] productArray = Algorithm2.productArrayExtended(numbers);
        System.out.println(Arrays.toString(productArray));
    }

    // Problem 10
    public static void runExecuteTask(){

        methodCallDelimiter('=', 50);

        Function<Double, Double> function = x -> Math.pow(x, 2) + 4 * x + 4; 
        double output = Algorithm10.executeTask(function, 10.0, 2000);
        System.out.println(output);
    }

    // Problem 292
    public static void runCalculateNumberOfBoats(){

        methodCallDelimiter('=', 50);

        int[] weights = {100, 200, 150, 80};
        int weightLimit = 200;
        int boats = Algorithm292.calculateNumberOfBoats(weights, weightLimit, 2);
        System.out.printf("Number of boats needed for %d people is %d\n", weights.length, boats);

        int[] weights1 = {45, 60, 100, 120,260, 300, 210, 150, 70, 90, 30};
        weightLimit = 150;
        boats = Algorithm292.calculateNumberOfBoats(weights1, weightLimit, 2);
        System.out.printf("Number of boats needed for %d people is %d\n", weights1.length, boats);
    }

    //Problem 27
    public static void runCheckBrackets(){

        methodCallDelimiter('=', 50);

        char[] brackets = {'H', '[', ')', ']'};
        boolean areValid = true;

        try{
            areValid = Algorithm27.checkBrackets(brackets);

            if(areValid){
                System.out.println("Brackets are valid");
            }
            else{
                System.out.println("Brackets are invalid");
            }
        }
        catch(IllegalArgumentException e){
            System.out.println(e);
        }
    }

    public static void runCheckBrackets1(){

        methodCallDelimiter('=', 50);

        char[] brackets = {'[', '(', ')', ']'};
        boolean areValid = Algorithm27.checkBrackets1(brackets);

        if(areValid){
            System.out.println("Brackets are valid");
        }
        else{
            System.out.println("Brackets are invalid");
        }
    }

    // Problem 29
    public static void runEncodeString(){

        methodCallDelimiter('=', 50);

        try {
            String string = "AAABBBCCFAGHMAANN";
            String encoded = Algorithm29.encodeString(string);
            System.out.println(encoded);
        }
        catch(EncodingException e){
            System.out.println(e);
        }
    }

    public static void runDecodeString(){

        methodCallDelimiter('=', 50);

        String encoded = "200000A140000B10000F6000H40000M";
        try {
            String decoded = Algorithm29.decodeString(encoded);
            //System.out.println(decoded);
            String decoded1 = Algorithm29.decodeString1(encoded);
            //System.out.println(decoded1);
            String decoded2 = Algorithm29.decodeString2(encoded);
        }
        catch(EncodingException e){
            System.out.println(e);
        }
        //System.out.println(decoded2);
    }

    // Problem 37
    public static void runGetSubsets(){

        methodCallDelimiter('=', 50);

        Set<Character> numbers = new HashSet<>(Arrays.asList('a', 'b', 'c'));
        Set<Set<Character>> subsets = new HashSet<>();
        Algorithm37.getSubsets(numbers, subsets);
        System.out.println(subsets);

        Utilities.Function<Set<Character>, Set<Set<Character>>, Void> func = Algorithm37::getSubsets;
        System.out.printf("Execution time: %fs", (double)Utilities.measureExecutionTime(func, numbers, subsets) / 1e9);
    }
}
