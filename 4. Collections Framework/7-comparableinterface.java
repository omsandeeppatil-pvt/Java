import java.util.*;

class Student implements Comparable<Student> {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Implementing compareTo method to sort students by ID
    @Override
    public int compareTo(Student other) {
        return this.id - other.id; // Sorting by id
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "'}";
    }
}

public class ComparableInterface {
    public static void main(String[] args) {
        // Creating a list of students
        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "John"));
        students.add(new Student(1, "Alice"));
        students.add(new Student(2, "Bob"));

        // Sorting students by id using Comparable
        Collections.sort(students);

        System.out.println("Students sorted by ID:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
