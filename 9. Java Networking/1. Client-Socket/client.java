import java.io.*;
import java.net.*;

public class ClientSocketExample {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 12345)) { // Connect to server on localhost and port 12345
            System.out.println("Connected to server!");

            // Output and Input streams for communication
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            output.println("Hello Server!"); // Send message to server
            String serverMessage = input.readLine();
            System.out.println("Server says: " + serverMessage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
