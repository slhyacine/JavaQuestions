package runnableCallable;

import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        // runnable execution
        (new Thread(() -> System.out.println("Hello"))).start();
        (new Thread(new RunnableExample())).start();

        // callable execution
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> submit = executorService.submit(new CallableExample());
        System.out.println(submit.get());
        executorService.shutdown();
    }

}
