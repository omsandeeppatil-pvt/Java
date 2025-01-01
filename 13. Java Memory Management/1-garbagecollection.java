public class GarbageCollectionDemo {
    public static void main(String[] args) {
        // Creating objects in a loop
        for (int i = 0; i < 1000; i++) {
            new GarbageObject();
        }
        System.out.println("Objects created. Waiting for garbage collection.");
    }
}

class GarbageObject {
    // Finalize method to observe when the object is garbage collected
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collected for object: " + this);
    }
}
