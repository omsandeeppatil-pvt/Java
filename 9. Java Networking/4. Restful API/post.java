import java.io.*;
import java.net.*;

public class RestApiPostRequest {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://jsonplaceholder.typicode.com/posts"); // Example API endpoint
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("POST"); // Set HTTP method to POST
            connection.setRequestProperty("Content-Type", "application/json; utf-8");
            connection.setDoOutput(true); // Allow sending data in POST request

            // JSON data to send in POST request
            String jsonData = "{\"title\": \"foo\", \"body\": \"bar\", \"userId\": 1}";

            // Write data to request body
            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = jsonData.getBytes("utf-8");
                os.write(input, 0, input.length);
            }

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
