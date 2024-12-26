class OuterClass {
    private String outerMessage = "Outer Class Message";

    // Static Nested Class
    static class StaticNestedClass {
        void display() {
            System.out.println("This is a Static Nested Class.");
        }
    }

    // Non-static (Inner) Class
    class InnerClass {
        void display() {
            System.out.println("This is an Inner Class.");
            System.out.println("Accessing outer class member: " + outerMessage);
        }
    }

    // Method to demonstrate inner class usage
    void createInnerClass() {
        InnerClass inner = new InnerClass();
        inner.display();
    }
}

public class NestedAndInnerClasses {
    public static void main(String[] args) {
        // Accessing Static Nested Class without outer class object
        OuterClass.StaticNestedClass staticNested = new OuterClass.StaticNestedClass();
        staticNested.display();

        // Accessing Inner Class requires outer class instance
        OuterClass outer = new OuterClass();
        outer.createInnerClass();
    }
}
