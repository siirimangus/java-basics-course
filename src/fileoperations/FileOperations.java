package fileoperations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileOperations {
    public static void main(String[] args) {
        // Create file
//        try {
//            Path path = Paths.get("src", "fileoperations", "test.txt");
//            File file = new File(String.valueOf(path));
//
//            file.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
        // Write to file
//        Path path = Paths.get("src", "fileoperations", "test.txt");
//        try (BufferedWriter writer = Files.newBufferedWriter(path, StandardOpenOption.APPEND)) {
//            writer.write("Hello World!\r\n");
//        } catch (IOException e) {
//            System.out.println("IOException:" + e.getMessage());
//            e.printStackTrace();
//        }

        // Read from file
        List<String> lines = new ArrayList<>();
        Path pathToRead = Paths.get("src", "fileoperations", "test.txt");
        try (BufferedReader reader = Files.newBufferedReader(pathToRead)) {
            while (true) {
                String line = reader.readLine();
                if (line == null) break;
                lines.add(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file:" + e.getMessage());
            e.printStackTrace();
        }

        System.out.println(lines);

        // Read from file with Scanner
        String longestWord = "";
        String current;
        try (Scanner scanner = new Scanner(Paths.get("src", "fileoperations", "test.txt"))) {
            while (scanner.hasNext()) {
                current = scanner.next();
                if (current.length() > longestWord.length()) {
                    longestWord = current;
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        System.out.println("Longest word in file is: " + longestWord);
    }
}
