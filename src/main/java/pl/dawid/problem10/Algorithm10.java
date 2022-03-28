package pl.dawid.problem10;

import java.util.function.Function;

public class Algorithm10 {

    private Algorithm10(){};
    
    public static <T, E> E executeTask(Function<T, E> function, T input, int delay){
        try{
            Thread.sleep(delay);
        }
        catch(InterruptedException exc){
            System.out.println(exc);
        }
        return function.apply(input);      
    }
}
