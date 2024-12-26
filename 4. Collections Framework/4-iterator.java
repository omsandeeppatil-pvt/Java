import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {
        // Creating a collection (ArrayList)
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("JavaScript");

        // Using Iterator to traverse the collection
        Iterator<String> iterator = list.iterator();
        System.out.println("Using Iterator:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
