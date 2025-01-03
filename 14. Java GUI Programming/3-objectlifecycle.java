public class ObjectLifecycle {
    public static void main(String[] args) {
        // Creating and destroying objects
        for (int i = 0; i < 3; i++) {
            LifecycleObject obj = new LifecycleObject(i);
            System.out.println("Created: " + obj);
            obj = null; // Make eligible for GC
        }

        // Request garbage collection
        System.out.println("Requesting garbage collection...");
        System.gc();
    }
}

class LifecycleObject {
    private int id;

    public LifecycleObject(int id) {
        this.id = id;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalizing object with ID: " + id);
    }

    @Override
    public String toString() {
        return "LifecycleObject{" + "id=" + id + '}';
    }
}
