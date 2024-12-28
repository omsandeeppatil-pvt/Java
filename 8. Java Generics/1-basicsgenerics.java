import java.util.*;

public class BasicsGenerics {
    public static void main(String[] args) {
        // Using a Generic List
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        System.out.println("Names: " + names);

        // Using a Generic Map
        Map<Integer, String> idToName = new HashMap<>();
        idToName.put(1, "Alice");
        idToName.put(2, "Bob");
        idToName.put(3, "Charlie");

        // Iterating over the Map
        for (Map.Entry<Integer, String> entry : idToName.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
