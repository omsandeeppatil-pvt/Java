import java.util.Optional;

public class HandleOptional {
    public static void main(String[] args) {
        // Creating an Optional with a value
        Optional<String> optionalValue = Optional.of("Hello, Java!");
        System.out.println("Value: " + optionalValue.orElse("Default Value"));

        // Creating an empty Optional
        Optional<String> emptyOptional = Optional.empty();
        System.out.println("Empty Value: " + emptyOptional.orElse("Default Value"));

        // Using ifPresent() to execute code if the value is present
        optionalValue.ifPresent(value -> System.out.println("Uppercase: " + value.toUpperCase()));
    }
}
