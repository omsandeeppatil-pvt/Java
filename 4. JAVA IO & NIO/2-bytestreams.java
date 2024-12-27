import java.io.*;

public class ByteStreams {
    public static void main(String[] args) {
        // File paths
        String inputFilePath = "inputFile.txt";
        String outputFilePath = "outputFile.txt";

        try (FileInputStream inputStream = new FileInputStream(inputFilePath);
             FileOutputStream outputStream = new FileOutputStream(outputFilePath)) {

            // Reading and writing byte-by-byte using byte streams
            int byteData;
            while ((byteData = inputStream.read()) != -1) {
                outputStream.write(byteData);
            }
            System.out.println("Byte streams: Data copied from inputFile to outputFile.");

        } catch (IOException e) {
            System.out.println("Error during byte stream operations: " + e.getMessage());
        }
    }
}
