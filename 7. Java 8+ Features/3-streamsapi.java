import java.util.*;
import java.util.stream.Collectors;

public class StreamsAPI {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);

        // Filtering even numbers
        List<Integer> evens = numbers.stream()
                                     .filter(num -> num % 2 == 0)
                                     .collect(Collectors.toList());
        System.out.println("Even Numbers: " + evens);

        // Mapping numbers to their squares
        List<Integer> squares = numbers.stream()
                                       .map(num -> num * num)
                                       .collect(Collectors.toList());
        System.out.println("Squares: " + squares);

        // Reducing to calculate the sum of all numbers
        int sum = numbers.stream()
                         .reduce(0, Integer::sum);
        System.out.println("Sum: " + sum);
    }
}
