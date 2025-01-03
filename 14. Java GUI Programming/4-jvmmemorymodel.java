public class JVMMemoryModel {
    public static void main(String[] args) {
        // Stack: Local variables are stored
        int localVariable = 10;

        // Heap: Objects are created in the heap
        String heapObject = new String("Hello, Heap!");

        // Printing memory usage details
        Runtime runtime = Runtime.getRuntime();
        System.out.println("JVM Memory Details:");
        System.out.println("Max Memory: " + runtime.maxMemory() / 1024 / 1024 + " MB");
        System.out.println("Total Memory: " + runtime.totalMemory() / 1024 / 1024 + " MB");
        System.out.println("Free Memory: " + runtime.freeMemory() / 1024 / 1024 + " MB");

        // Print Metaspace usage
        System.out.println("Metaspace is used for class metadata and static data.");
    }
}
