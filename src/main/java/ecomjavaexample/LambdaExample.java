package ecomjavaexample;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;


public class LambdaExample {
    public String handleRequest(int myCount, Context context){
        LambdaLogger logger = context.getLogger();
        logger.log("received " + myCount);
        return String.valueOf(myCount);
    }
}
