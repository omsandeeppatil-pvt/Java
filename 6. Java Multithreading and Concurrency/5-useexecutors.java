import java.util.concurrent.*;

public class UseExecutors {
    public static void main(String[] args) {
        // Creating a thread pool with 2 threads
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        // Submitting tasks to the executor service
        executorService.submit(() -> {
            System.out.println(Thread.currentThread().getName() + " - Task 1 is running.");
        });
        
        executorService.submit(() -> {
            System.out.println(Thread.currentThread().getName() + " - Task 2 is running.");
        });

        // Shutting down the executor service
        executorService.shutdown();
    }
}
