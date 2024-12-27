import java.util.concurrent.*;

public class CyclicBarrierExample {
    public static void main(String[] args) throws InterruptedException {
        // Creating a CyclicBarrier for 3 threads
        CyclicBarrier barrier = new CyclicBarrier(3, () -> System.out.println("All threads are ready, proceeding..."));

        Runnable task = () -> {
            try {
                System.out.println(Thread.currentThread().getName() + " is ready.");
                barrier.await(); // Wait for other threads to reach the barrier
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        };

        // Starting 3 threads that will wait at the barrier
        new Thread(task).start();
        new Thread(task).start();
        new Thread(task).start();
    }
}
