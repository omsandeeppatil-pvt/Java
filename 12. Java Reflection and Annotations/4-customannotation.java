import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Define a custom annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation {
    String value() default "Default Annotation Value";
}

// Use the custom annotation
class AnnotationExample {
    @MyAnnotation(value = "Custom Annotation Applied")
    public void annotatedMethod() {
        System.out.println("Inside annotated method.");
    }
}

public class CustomAnnotation {
    public static void main(String[] args) {
        try {
            // Get the class object
            Class<?> cls = AnnotationExample.class;

            // Access the annotated method
            Method method = cls.getMethod("annotatedMethod");

            // Check if the method is annotated
            if (method.isAnnotationPresent(MyAnnotation.class)) {
                // Get the annotation
                MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);

                // Print annotation value
                System.out.println("Annotation Value: " + annotation.value());

                // Invoke the annotated method
                method.invoke(cls.getDeclaredConstructor().newInstance());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
