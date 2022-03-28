package pl.dawid.problem15;

import java.util.Random;

public class Algorithm15 {

    private Algorithm15(){};
    
    public static Object pickFromStream(Object[] stream){
        Random rand = new Random();
        return stream[rand.nextInt(stream.length)];
    }
}
