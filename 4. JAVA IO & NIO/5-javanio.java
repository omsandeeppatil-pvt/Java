import java.io.*;
import java.nio.*;
import java.nio.channels.*;

public class JavaNIO {
    public static void main(String[] args) {
        // File paths
        String inputFilePath = "nioInputFile.txt";
        String outputFilePath = "nioOutputFile.txt";

        try {
            // Open file using FileChannel
            FileChannel inputChannel = new FileInputStream(inputFilePath).getChannel();
            FileChannel outputChannel = new FileOutputStream(outputFilePath).getChannel();

            // Allocate a buffer of 1024 bytes
            ByteBuffer buffer = ByteBuffer.allocate(1024);

            // Read from input channel and write to output channel
            while (inputChannel.read(buffer) != -1) {
                buffer.flip(); // Prepare buffer for reading
                outputChannel.write(buffer);
                buffer.clear(); // Clear buffer for next read
            }

            System.out.println("NIO: Data copied from nioInputFile to nioOutputFile using Channels and Buffers.");

            inputChannel.close();
            outputChannel.close();

        } catch (IOException e) {
            System.out.println("Error during NIO operations: " + e.getMessage());
        }
    }
}
