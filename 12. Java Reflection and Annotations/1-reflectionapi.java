import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;

class SampleClass {
    private String message = "Hello, Reflection!";

    public void displayMessage() {
        System.out.println(message);
    }
}

public class ReflectionAPIBasics {
    public static void main(String[] args) {
        try {
            // Get Class object
            Class<?> cls = SampleClass.class;

            // Print class name
            System.out.println("Class Name: " + cls.getName());

            // Get and print constructors
            Constructor<?>[] constructors = cls.getConstructors();
            System.out.println("Constructors:");
            for (Constructor<?> constructor : constructors) {
                System.out.println(" " + constructor.getName());
            }

            // Get and print methods
            Method[] methods = cls.getDeclaredMethods();
            System.out.println("Methods:");
            for (Method method : methods) {
                System.out.println(" " + method.getName());
            }

            // Get and print fields
            Field[] fields = cls.getDeclaredFields();
            System.out.println("Fields:");
            for (Field field : fields) {
                System.out.println(" " + field.getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
