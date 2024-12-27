import java.util.concurrent.locks.*;

class CounterWithLock {
    private int count = 0;
    private final Lock lock = new ReentrantLock();

    // Method to increment the counter using Lock for synchronization
    public void increment() {
        lock.lock(); // Acquire the lock
        try {
            count++;
            System.out.println(Thread.currentThread().getName() + " - Count: " + count);
        } finally {
            lock.unlock(); // Always release the lock
        }
    }
}

public class UseLocks {
    public static void main(String[] args) {
        CounterWithLock counter = new CounterWithLock();

        // Creating two threads that call the increment method using locks
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                counter.increment();
            }
        });

        t1.start(); // Start thread t1
        t2.start(); // Start thread t2
    }
}
