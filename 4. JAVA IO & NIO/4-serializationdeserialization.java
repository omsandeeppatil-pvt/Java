import java.io.*;

// Class to be serialized
class Person implements Serializable {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class SerializationDeserialization {
    public static void main(String[] args) {
        // File paths
        String filePath = "person.ser";

        // Creating an object of Person
        Person person = new Person("John", 25);

        // Serializing the object
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath))) {
            out.writeObject(person);
            System.out.println("Object has been serialized.");
        } catch (IOException e) {
            System.out.println("Error during serialization: " + e.getMessage());
        }

        // Deserializing the object
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filePath))) {
            Person deserializedPerson = (Person) in.readObject();
            System.out.println("Deserialized Object: " + deserializedPerson);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error during deserialization: " + e.getMessage());
        }
    }
}
