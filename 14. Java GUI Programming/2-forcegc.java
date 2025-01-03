public class ForceGarbageCollection {
    public static void main(String[] args) {
        GarbageObject obj1 = new GarbageObject();
        GarbageObject obj2 = new GarbageObject();

        // Setting objects to null to make them eligible for GC
        obj1 = null;
        obj2 = null;

        // Explicitly calling garbage collector
        System.out.println("Calling garbage collector...");
        System.gc();

        System.out.println("Garbage collection requested.");
    }
}

class GarbageObject {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collected for object: " + this);
    }
}
