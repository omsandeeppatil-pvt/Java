// Importing necessary packages
class MyThread extends Thread {
    // Override the run() method to define thread behavior
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running.");
    }

    public static void main(String[] args) {
        // Creating and starting threads
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        
        t1.start(); // Start thread t1
        t2.start(); // Start thread t2
        
        // Main thread continues execution
        System.out.println(Thread.currentThread().getName() + " is running.");
    }
}
