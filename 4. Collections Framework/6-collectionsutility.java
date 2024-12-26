import java.util.*;

public class CollectionsUtility {
    public static void main(String[] args) {
        // Creating a collection (ArrayList)
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Orange");
        list.add("Banana");
        list.add("Mango");

        // Sorting the list
        Collections.sort(list);
        System.out.println("Sorted List: " + list);

        // Shuffling the list (random order)
        Collections.shuffle(list);
        System.out.println("Shuffled List: " + list);

        // Finding the maximum and minimum values
        String max = Collections.max(list);
        String min = Collections.min(list);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
