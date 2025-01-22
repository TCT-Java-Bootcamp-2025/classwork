package class3.files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

    public static void main(String[] args) {

        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter("output.txt"))) {
            writer.write("Hello, world! \nI am writing my first file.");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }

    }
}
