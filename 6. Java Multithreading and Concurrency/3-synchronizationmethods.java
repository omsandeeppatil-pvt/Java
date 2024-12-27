class Counter {
    private int count = 0;

    // Synchronized method to ensure thread safety
    public synchronized void increment() {
        count++;
        System.out.println(Thread.currentThread().getName() + " - Count: " + count);
    }
}

public class SynchronizationMethods {
    public static void main(String[] args) {
        Counter counter = new Counter();

        // Creating two threads that call the synchronized method
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
