import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UserStringHandler {
    public static void main(String[] args) {
        String userString = userString();
        if (!userString.isEmpty()) { System.out.println(userString); }
    }

    public static String userString() {
        String userString;

        Scanner scanner = new Scanner(System.in);

        System.out.print("(IMPORTANT: you're string must contain vowels!) Enter a string: ");
        userString = scanner.next();
        scanner.close();

        try {
            checkForVowels(userString);
        } catch (VowelsNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
            return "";
        }

        return userString;
    }

    public static void checkForVowels(String userString) throws VowelsNotFoundException {
        Set<Character> vowels = new HashSet<>(Set.of(
                'a', 'e', 'i', 'o', 'u'
        ));

        boolean hasVowels = false;
        for (int i = 0; i < userString.length(); i++) {
            if ( vowels.contains(userString.charAt(i)) ) {
                hasVowels = true;
                break;
            }
        }

        if (!hasVowels) throw new VowelsNotFoundException("String must contain vowels!");
    }
}
