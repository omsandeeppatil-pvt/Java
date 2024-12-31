public class DynamicClassLoading {
    public static void main(String[] args) {
        try {
            // Dynamically load the SampleClass
            Class<?> cls = Class.forName("SampleClass");

            // Create an instance of the class
            Object obj = cls.getDeclaredConstructor().newInstance();

            // Access and invoke a method
            Method method = cls.getDeclaredMethod("displayMessage");
            method.invoke(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// Class to be dynamically loaded
class SampleClass {
    public void displayMessage() {
        System.out.println("Dynamic Class Loading Example");
    }
}
