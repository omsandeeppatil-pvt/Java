import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TransactionManagement {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String username = "root";
        String password = "password";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            // Turn off auto-commit
            connection.setAutoCommit(false);

            try (Statement statement = connection.createStatement()) {
                // SQL queries for inserting data
                statement.executeUpdate("INSERT INTO students (id, name, age) VALUES (2, 'Bob', 22)");
                statement.executeUpdate("INSERT INTO students (id, name, age) VALUES (3, 'Charlie', 23)");

                // Commit the transaction
                connection.commit();
                System.out.println("Transaction committed successfully!");
            } catch (Exception e) {
                connection.rollback(); // Rollback transaction in case of error
                System.out.println("Transaction rolled back due to an error.");
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
