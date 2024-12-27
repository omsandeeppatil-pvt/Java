import java.io.*;

public class CharacterStreams {
    public static void main(String[] args) {
        // File paths
        String inputFilePath = "inputCharFile.txt";
        String outputFilePath = "outputCharFile.txt";

        try (FileReader reader = new FileReader(inputFilePath);
             FileWriter writer = new FileWriter(outputFilePath)) {

            // Reading and writing character-by-character using character streams
            int charData;
            while ((charData = reader.read()) != -1) {
                writer.write(charData);
            }
            System.out.println("Character streams: Data copied from inputCharFile to outputCharFile.");

        } catch (IOException e) {
            System.out.println("Error during character stream operations: " + e.getMessage());
        }
    }
}
