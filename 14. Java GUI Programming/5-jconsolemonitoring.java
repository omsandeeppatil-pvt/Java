public class JConsoleMonitoring {
    public static void main(String[] args) throws InterruptedException {
        // Simulate workload to monitor using JConsole
        for (int i = 1; i <= 10; i++) {
            System.out.println("Iteration: " + i);

            // Allocate memory by creating objects
            String[] largeArray = new String[100000];
            for (int j = 0; j < largeArray.length; j++) {
                largeArray[j] = "Data-" + j;
            }

            // Pause for a few seconds to observe memory changes
            Thread.sleep(2000);
        }

        System.out.println("Program completed. Monitor this application using JConsole.");
    }
}
