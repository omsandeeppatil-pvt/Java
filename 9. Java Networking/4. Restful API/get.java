import java.io.*;
import java.net.*;

public class RestApiGetRequest {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://jsonplaceholder.typicode.com/posts/1"); // Example API endpoint
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET"); // Set HTTP method to GET
            connection.setRequestProperty("Accept", "application/json");

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
