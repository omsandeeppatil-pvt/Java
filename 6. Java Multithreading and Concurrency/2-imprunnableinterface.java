class MyRunnable implements Runnable {
    // Override the run() method from Runnable interface
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running.");
    }

    public static void main(String[] args) {
        // Create a runnable object
        MyRunnable myRunnable = new MyRunnable();
        
        // Create two thread objects and pass the runnable object to them
        Thread t1 = new Thread(myRunnable);
        Thread t2 = new Thread(myRunnable);
        
        t1.start(); // Start thread t1
        t2.start(); // Start thread t2
    }
}
