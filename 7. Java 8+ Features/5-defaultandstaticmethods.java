interface MyInterface {
    // Abstract method
    void abstractMethod();

    // Default method
    default void defaultMethod() {
        System.out.println("This is a default method.");
    }

    // Static method
    static void staticMethod() {
        System.out.println("This is a static method.");
    }
}

public class DefaultAndStaticMethods implements MyInterface {
    @Override
    public void abstractMethod() {
        System.out.println("Abstract method implemented.");
    }

    public static void main(String[] args) {
        DefaultAndStaticMethods obj = new DefaultAndStaticMethods();
        
        // Calling abstract method
        obj.abstractMethod();
        
        // Calling default method
        obj.defaultMethod();
        
        // Calling static method (directly from the interface)
        MyInterface.staticMethod();
    }
}
