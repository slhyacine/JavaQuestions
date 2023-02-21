package runnableCallable;

import java.util.concurrent.Callable;

public class CallableExample implements Callable<String> {
    @Override
    public String call() throws Exception {
        System.out.println("Callable example executed successfully");
        return "Success";
    }
}
