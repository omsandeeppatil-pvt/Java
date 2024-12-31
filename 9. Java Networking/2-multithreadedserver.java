import java.io.*;
import java.net.*;

public class MultiThreadedServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(12345)) { // Server listening on port 12345
            System.out.println("Multi-threaded Server is running...");

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connected!");

                // Handle each client in a separate thread
                new Thread(new ClientHandler(clientSocket)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class ClientHandler implements Runnable {
    private Socket clientSocket;

    public ClientHandler(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    @Override
    public void run() {
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter output = new PrintWriter(clientSocket.getOutputStream(), true);

            String clientMessage = input.readLine();
            System.out.println("Client says: " + clientMessage);
            output.println("Message received: " + clientMessage);

            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
