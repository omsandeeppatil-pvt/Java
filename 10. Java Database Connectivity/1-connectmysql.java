import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectToMySQL {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb"; // Replace `testdb` with your database name
        String username = "root"; // Replace with your MySQL username
        String password = "password"; // Replace with your MySQL password

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            if (connection != null) {
                System.out.println("Connected to the database successfully!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
