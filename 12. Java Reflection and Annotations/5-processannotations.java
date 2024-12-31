import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Method;

// Define a custom annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Test {
    String testCase() default "Default Test Case";
}

// Use the custom annotation
class TestCaseExample {
    @Test(testCase = "Test Case 1")
    public void testMethod1() {
        System.out.println("Executing Test Case 1");
    }

    @Test(testCase = "Test Case 2")
    public void testMethod2() {
        System.out.println("Executing Test Case 2");
    }

    public void normalMethod() {
        System.out.println("This is a normal method.");
    }
}

public class ProcessAnnotations {
    public static void main(String[] args) {
        try {
            // Get class object
            Class<?> cls = TestCaseExample.class;

            // Iterate through methods
            for (Method method : cls.getDeclaredMethods()) {
                // Check if the method has the @Test annotation
                if (method.isAnnotationPresent(Test.class)) {
                    // Get the annotation
                    Test test = method.getAnnotation(Test.class);

                    // Print the test case information
                    System.out.println("Found Test Method: " + method.getName());
                    System.out.println("Test Case: " + test.testCase());

                    // Invoke the test method
                    method.invoke(cls.getDeclaredConstructor().newInstance());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
