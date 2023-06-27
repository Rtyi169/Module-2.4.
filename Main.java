// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String fileName = "test.txt"; // Replace with the actual file name/path

        Set<String> uniqueWords = new HashSet<>(); // Set to store unique words

        try {
            Scanner scanner = new Scanner(new File(fileName)); // Create a scanner to read the file
            while (scanner.hasNext()) {
                String word = scanner.next().replaceAll("[^a-zA-Z]", "").toLowerCase(); // Remove non-alphabetic characters and convert to lowercase
                uniqueWords.add(word); // Add the processed word to the set
            }
            scanner.close(); // Close the scanner
        } catch (FileNotFoundException e) {
            e.printStackTrace(); // Handle file not found exception
        }

        int uniqueWordCount = uniqueWords.size(); // Get the number of unique words in the set
        System.out.println("Number of unique words: " + uniqueWordCount); // Print the result
    }
}
