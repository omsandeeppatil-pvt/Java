import java.util.*;

public class UnboundedWildcards {
    // Method with unbounded wildcard
    public static void printElements(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Apple", "Banana", "Cherry");
        List<Integer> numbers = Arrays.asList(10, 20, 30);

        System.out.println("String List:");
        printElements(strings);

        System.out.println("Number List:");
        printElements(numbers);
    }
}
