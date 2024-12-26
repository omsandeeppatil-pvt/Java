import java.lang.annotation.*;

// Defining a custom annotation
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
    String value() default "Default Value";
}

class AnnotatedClass {
    @MyAnnotation(value = "Custom Value")
    void annotatedMethod() {
        System.out.println("Annotated Method Called");
    }
}

public class AnnotationsInJava {
    public static void main(String[] args) throws Exception {
        AnnotatedClass obj = new AnnotatedClass();
        obj.annotatedMethod();

        // Accessing annotation data using reflection
        MyAnnotation annotation = obj.getClass()
                                      .getMethod("annotatedMethod")
                                      .getAnnotation(MyAnnotation.class);
        if (annotation != null) {
            System.out.println("Annotation Value: " + annotation.value());
        }
    }
}
