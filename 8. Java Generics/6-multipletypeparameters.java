// Generic Class with Multiple Type Parameters
class KeyValue<K, V> {
    private K key;
    private V value;

    public KeyValue(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

public class MultipleTypeParameters {
    public static void main(String[] args) {
        // Creating a KeyValue object with Integer and String
        KeyValue<Integer, String> kv1 = new KeyValue<>(101, "John");
        System.out.println("Key: " + kv1.getKey() + ", Value: " + kv1.getValue());

        // Creating a KeyValue object with String and Double
        KeyValue<String, Double> kv2 = new KeyValue<>("Price", 49.99);
        System.out.println("Key: " + kv2.getKey() + ", Value: " + kv2.getValue());
    }
}
