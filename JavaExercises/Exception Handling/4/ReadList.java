import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class PositiveNumberException extends Exception {
    public PositiveNumberException(String message) {
        super(message);
    }
}

public class ReadList {
    public static void main(String[] args) {
        try {
            String filePath = "nums.txt";
            readList(filePath);
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void readList(String filePath) throws FileNotFoundException {
        File fileWithNums = new File(filePath);
        Scanner scanner = new Scanner(fileWithNums);

        while (scanner.hasNextLine()) {
            try {
                if (scanner.nextInt() > 0) {
                    throw new PositiveNumberException("Positive Number!");
                }
            } catch (PositiveNumberException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
