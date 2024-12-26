import java.util.*;

public class MapInterface {
    public static void main(String[] args) {
        // Using HashMap (unordered collection of key-value pairs)
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Apple");
        hashMap.put(2, "Banana");
        hashMap.put(3, "Cherry");

        System.out.println("HashMap: " + hashMap);

        // Using TreeMap (sorted collection of key-value pairs)
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "Orange");
        treeMap.put(1, "Grapes");
        treeMap.put(2, "Watermelon");

        System.out.println("TreeMap (sorted by key): " + treeMap);
    }
}
