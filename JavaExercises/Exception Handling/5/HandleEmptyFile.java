import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HandleEmptyFile {
    public static void main(String[] args) {
        String filePath = "empty.txt";

        try {
            readFile(filePath);
        } catch (FileNotFoundException | EmptyFileException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void readFile(String filePath) throws FileNotFoundException, EmptyFileException {
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);

        if (!scanner.hasNextLine()) {
            scanner.close();
            throw new EmptyFileException("File is empty!");
        }

        scanner.close();
    }
}
