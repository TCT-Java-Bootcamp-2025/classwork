package class3.exceptions;

import java.io.*;

public class CheckedExample {
    public static void readFile() throws IOException {
        FileReader file = new FileReader("nonexistentfile.txt");
        file.read();
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}

