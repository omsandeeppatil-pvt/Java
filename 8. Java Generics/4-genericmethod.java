public class GenericMethod {
    // Generic method to print array elements
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        String[] strings = {"Java", "Generics", "Example"};
        Integer[] integers = {1, 2, 3, 4};

        System.out.println("String Array:");
        printArray(strings);

        System.out.println("Integer Array:");
        printArray(integers);
    }
}
