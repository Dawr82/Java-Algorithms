package pl.dawid;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Test {
    public static void main(String[] args){
        Result result = JUnitCore.runClasses(TestSuite.class);

        for(Failure failure : result.getFailures()){
            System.out.println(failure);
        }

        if(result.wasSuccessful()){
            System.out.println("Test suite was successful");
        }
        else{
            System.out.println("Test suite unsuccessful");
        }
    }
}
