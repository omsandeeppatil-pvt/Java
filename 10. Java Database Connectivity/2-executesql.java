import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ExecuteSQLQueries {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String username = "root";
        String password = "password";

        try (Connection connection = DriverManager.getConnection(url, username, password);
             Statement statement = connection.createStatement()) {

            // SQL Query to create a table
            String createTableSQL = "CREATE TABLE students (id INT PRIMARY KEY, name VARCHAR(50), age INT)";
            statement.executeUpdate(createTableSQL);
            System.out.println("Table created successfully!");

            // SQL Query to insert data
            String insertDataSQL = "INSERT INTO students (id, name, age) VALUES (1, 'Alice', 20)";
            statement.executeUpdate(insertDataSQL);
            System.out.println("Data inserted successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
