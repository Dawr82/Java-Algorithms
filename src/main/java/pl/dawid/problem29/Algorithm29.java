package pl.dawid.problem29;

import pl.dawid.utils.Utilities;

public class Algorithm29 {

    private Algorithm29(){};

    public static boolean isEncoded(String string){
        boolean wasLetter = true;

        if (Utilities.isNumeric(string)){
            return false;
        }

        for(int i = 0; i < string.length(); ++i){
            if(Character.isAlphabetic(string.charAt(i))) {
                if (wasLetter) {
                    return false;
                } else {
                    wasLetter = true;
                }
            }
            else if (Character.isDigit(string.charAt(i))){
                wasLetter = false;
            }
            else{
                return false;
            }
        }
        return true;
    }


    public static String encodeString(String string) throws EncodingException{

        if(!Utilities.containsOnlyLetters(string)){
            throw new EncodingException("Input string contains invalid characters.");
        }

        int lCount = 1;
        char[] toEncode = string.toCharArray();
        StringBuilder builder = new StringBuilder();

        for (int i = 1; i < toEncode.length; ++i){
            if (toEncode[i] != toEncode[i - 1]){
                builder.append(lCount);
                builder.append(toEncode[i - 1]);
                lCount = 1;
            }
            else{
                lCount++;
            }
        }

        builder.append(lCount);
        builder.append(toEncode[toEncode.length - 1]);

        return builder.toString();
    }

    public static String decodeString(String encoded) throws EncodingException{

        if(!isEncoded(encoded)){
            throw new EncodingException("Input string isn't properly encoded.");
        }

        StringBuilder builder = new StringBuilder();

        long startTime = System.nanoTime();

        int digitCount = 0;

        for(int i = 0; i < encoded.length(); ++i){
            if (Character.isLetter(encoded.charAt(i))){
                int number = Integer.parseInt(encoded.substring(i - digitCount, i));
                builder.append(String.valueOf(encoded.charAt(i)).repeat(number));
                digitCount = 0;
            }
            else{
                digitCount++;
            }
        }

        long endTime = System.nanoTime();
        System.out.printf("Execution time: %d\n", endTime - startTime);

        return builder.toString();
    }

    public static String decodeString1(String encoded) throws EncodingException{

        if(!isEncoded(encoded)){
            throw new EncodingException("Input string isn't properly encoded.");
        }

        String decoded = "";

        long startTime = System.nanoTime();

        int digitCount = 0;

        for(int i = 0; i < encoded.length(); ++i){
            if (Character.isLetter(encoded.charAt(i))){
                int number = Integer.parseInt(encoded.substring(i - digitCount, i));
                decoded += String.valueOf(encoded.charAt(i)).repeat(number);
                digitCount = 0;
            }
            else{
                digitCount++;
            }
        }

        long endTime = System.nanoTime();

        System.out.printf("Execution time: %d\n", endTime - startTime);

        return decoded;
    }

    public static String decodeString2(String encoded) throws EncodingException{

        if(!isEncoded(encoded)){
            throw new EncodingException("Input string isn't properly encoded.");
        }

        StringBuilder builder = new StringBuilder();

        long startTime = System.nanoTime();

        int digitCount = 0;

        for(int i = 0; i < encoded.length(); ++i){
            if (Character.isLetter(encoded.charAt(i))){
                int number = Integer.parseInt(encoded.substring(i - digitCount, i));
                for(int j = 0; j < number; ++j){
                    builder.append(encoded.charAt(i));
                }
                digitCount = 0;
            }
            else{
                digitCount++;
            }
        }

        long endTime = System.nanoTime();
        System.out.printf("Execution time: %d\n", endTime - startTime);

        return builder.toString();
    }

}
