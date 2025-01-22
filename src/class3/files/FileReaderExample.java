package class3.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class FileReaderExample {
    public static void main(String[] args) {

        String filePath = "test.txt";
        try (BufferedReader reader = new BufferedReader(
                new FileReader(filePath))) {

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

    }
}
