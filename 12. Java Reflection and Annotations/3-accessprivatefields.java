import java.lang.reflect.Field;

class PrivateFieldsClass {
    private String secretMessage = "This is private!";
}

public class AccessPrivateFields {
    public static void main(String[] args) {
        try {
            // Create an instance of the class
            PrivateFieldsClass obj = new PrivateFieldsClass();

            // Get Class object
            Class<?> cls = obj.getClass();

            // Access the private field
            Field field = cls.getDeclaredField("secretMessage");

            // Make the private field accessible
            field.setAccessible(true);

            // Get and print the original value
            System.out.println("Original Value: " + field.get(obj));

            // Modify the private field
            field.set(obj, "Modified Secret Message!");

            // Print the modified value
            System.out.println("Modified Value: " + field.get(obj));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
