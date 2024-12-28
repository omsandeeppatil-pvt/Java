import java.util.*;

public class UseLambdaExpressions {
    public static void main(String[] args) {
        // Creating a list of numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Using lambda expression to iterate and print each number
        numbers.forEach(num -> System.out.println("Number: " + num));

        // Using lambda expression to find the square of each number
        numbers.forEach(num -> System.out.println("Square: " + (num * num)));
    }
}
