import java.util.concurrent.*;

public class SemaphoreExample {
    public static void main(String[] args) throws InterruptedException {
        // Creating a Semaphore with 2 available permits
        Semaphore semaphore = new Semaphore(2);

        Runnable task = () -> {
            try {
                semaphore.acquire(); // Acquire a permit
                System.out.println(Thread.currentThread().getName() + " is accessing the resource.");
                Thread.sleep(2000); // Simulating resource usage
                semaphore.release(); // Release the permit
                System.out.println(Thread.currentThread().getName() + " has released the resource.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        // Starting 5 threads that will compete for permits
        for (int i = 0; i < 5; i++) {
            new Thread(task).start();
        }
    }
}
