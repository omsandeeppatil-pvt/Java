class MyClass {
    // Static variable (shared among all instances)
    static int staticVar = 10;

    // Final variable (constant, value cannot be changed after initialization)
    final int finalVar;

    // Constructor to initialize final variable
    MyClass(int value) {
        finalVar = value;
    }

    // Static method (can be called without creating an object)
    static void staticMethod() {
        System.out.println("Static method called!");
    }

    // Final method (cannot be overridden in subclasses)
    final void finalMethod() {
        System.out.println("Final method called!");
    }

    // Instance method
    void instanceMethod() {
        System.out.println("Instance method called!");
    }
}

public class StaticAndFinalKeywords {
    public static void main(String[] args) {
        // Calling static method without creating an object
        MyClass.staticMethod();

        // Creating an object to access instance and final methods
        MyClass obj = new MyClass(100);
        obj.instanceMethod();
        obj.finalMethod();

        // Static variable is shared by all instances
        System.out.println("Static Variable: " + MyClass.staticVar);

        // Final variable cannot be changed after initialization
        System.out.println("Final Variable: " + obj.finalVar);

        // Modifying static variable
        MyClass.staticVar = 20;
        System.out.println("Updated Static Variable: " + MyClass.staticVar);
    }
}
