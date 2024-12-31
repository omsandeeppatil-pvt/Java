import java.io.*;
import java.net.*;

public class URLExample {
    public static void main(String[] args) {
        try {
            // Create a URL object
            URL url = new URL("https://www.example.com");

            // Open connection
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Set request method
            connection.setRequestMethod("GET");

            // Read response
            BufferedReader input = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
            input.close();

            System.out.println("Response Code: " + connection.getResponseCode());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
