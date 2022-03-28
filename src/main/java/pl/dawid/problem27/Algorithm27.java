package pl.dawid.problem27;

import java.util.stream.IntStream;
import java.util.stream.Collectors;
import java.util.Map;
import java.lang.Character;


public class Algorithm27 {

    private Algorithm27(){};

    public static boolean checkBrackets(char[] brackets){
        if (brackets.length % 2 == 0){
            for(int i = 0; i < brackets.length / 2; ++i){
                switch(brackets[i]){
                    case '(':
                        if (brackets[brackets.length - i - 1] != ')'){
                            return false;
                        }
                        break;
                    case '{':
                        if(brackets[brackets.length - i - 1] != '}'){
                            return false;
                        }
                        break;
                    case '[':
                        if(brackets[brackets.length - i - 1] != ']'){
                            return false;
                        }
                        break;
                    default:
                        throw new IllegalArgumentException("Input array may only consist of (, ), [, ], {, } characters.");
                }
            }
            return true;
        }   
        else{
            return false;
        }
    }

    public static boolean checkBrackets1(char[] brackets){
        char[] allBrackets = {'(', '[', '{', '}', ']', ')'};
        Map<Character, Character> bracketMatches = IntStream.range(0, 3).boxed().collect(Collectors.toMap(i -> allBrackets[i], i -> allBrackets[allBrackets.length - i - 1]));
       
        if (brackets.length % 2 == 0){
            for(int i = 0; i < brackets.length / 2; ++i){
                Character corr = brackets[brackets.length - i - 1];
                if(corr != bracketMatches.getOrDefault(brackets[i], null)){
                    return false;
                }
            }
            return true;
        }   
        else{
            return false;
        }
    }

}
