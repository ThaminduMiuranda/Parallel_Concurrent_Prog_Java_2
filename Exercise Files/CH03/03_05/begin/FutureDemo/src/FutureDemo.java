/**
 * Check how many vegetables are in the pantry
 */
import java.util.concurrent.*;

class HowManyVegitables implements Callable{
    public Integer call() throws Exception {
        System.out.println("Olivia is counting vegetables...");
        Thread.sleep(3000);
        return 42;
    }
}

public class FutureDemo {
    public static void main(String args[]) throws ExecutionException, InterruptedException {
        System.out.println("Barron asks Olivia how many vegetables are in the pantry.");
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future result = executor.submit(new HowManyVegitables());
        System.out.println("Barron can do other things while he waits for the result...");
        System.out.println("Olivia responded with " + result.get());
        executor.shutdown();
    }
}