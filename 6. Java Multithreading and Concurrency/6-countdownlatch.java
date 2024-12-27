import java.util.concurrent.*;

public class CountDownLatchExample {
    public static void main(String[] args) throws InterruptedException {
        // Creating a CountDownLatch with a count of 3
        CountDownLatch latch = new CountDownLatch(3);

        // Creating 3 threads that will count down the latch
        Runnable task = () -> {
            System.out.println(Thread.currentThread().getName() + " has finished task.");
            latch.countDown(); // Decrement the latch count
        };

        new Thread(task).start();
        new Thread(task).start();
        new Thread(task).start();

        latch.await(); // Wait until the latch count reaches 0
        System.out.println("All tasks are completed, proceeding with main thread.");
    }
}
