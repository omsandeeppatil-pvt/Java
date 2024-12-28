import java.util.*;

public class BoundedWildcards {
    // Method with bounded wildcard for Numbers
    public static void printNumbers(List<? extends Number> list) {
        for (Number num : list) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4);
        List<Double> doubles = Arrays.asList(1.1, 2.2, 3.3);

        System.out.println("Integer List:");
        printNumbers(integers);

        System.out.println("Double List:");
        printNumbers(doubles);
    }
}
