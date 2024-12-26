import java.util.*;

public class ListIteratorExample {
    public static void main(String[] args) {
        // Creating a collection (ArrayList)
        List<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Green");
        list.add("Blue");
        list.add("Yellow");

        // Using ListIterator to traverse the collection (forward and backward)
        ListIterator<String> listIterator = list.listIterator();

        System.out.println("Using ListIterator (forward traversal):");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("Using ListIterator (backward traversal):");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
