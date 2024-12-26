import java.util.*;

public class SetInterface {
    public static void main(String[] args) {
        // Using HashSet (unordered collection, no duplicates)
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Lion");
        hashSet.add("Tiger");
        hashSet.add("Elephant");
        hashSet.add("Lion"); // Duplicate element, won't be added

        System.out.println("HashSet: " + hashSet);

        // Using TreeSet (sorted collection, no duplicates)
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Zebra");
        treeSet.add("Monkey");
        treeSet.add("Giraffe");
        treeSet.add("Elephant");

        System.out.println("TreeSet (sorted): " + treeSet);
    }
}
