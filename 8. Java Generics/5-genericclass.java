// Generic Class
class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }
}

public class GenericClass {
    public static void main(String[] args) {
        // Creating a Pair of Integer and String
        Pair<Integer, String> pair = new Pair<>(1, "Alice");
        System.out.println("First: " + pair.getFirst() + ", Second: " + pair.getSecond());

        // Creating a Pair of String and Double
        Pair<String, Double> anotherPair = new Pair<>("Bob", 99.9);
        System.out.println("First: " + anotherPair.getFirst() + ", Second: " + anotherPair.getSecond());
    }
}
