import java.util.*;

public class ListInterface {
    public static void main(String[] args) {
        // Using ArrayList (a dynamic array)
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");

        System.out.println("ArrayList: " + arrayList);

        // Using LinkedList (a doubly linked list)
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Dog");
        linkedList.add("Elephant");
        linkedList.add("Fox");

        System.out.println("LinkedList: " + linkedList);

        // Accessing elements by index
        System.out.println("First element in ArrayList: " + arrayList.get(0));
        System.out.println("First element in LinkedList: " + linkedList.get(0));
    }
}
