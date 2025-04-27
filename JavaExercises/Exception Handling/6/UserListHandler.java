import java.util.*;

public class UserListHandler {
    public static void main(String[] args) {
        List<Integer> userList = readListFromUser();

        if (!userList.isEmpty()) { System.out.println(userList); }
    }

    public static List<Integer> readListFromUser() {
        List<Integer> userList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a size of you're list: ");
        int userListLength = scanner.nextInt();

        System.out.print("Enter a non-duplicate integers for you're list: ");
        while (userListLength > 0) {
            userList.add(scanner.nextInt());
            userListLength--;
        }
        scanner.close();

        try {
            checkForDuplicates(userList);
        } catch (DuplicatesNumbersException e) {
            System.out.println("Error: " + e.getMessage());
            return new ArrayList<>();
        }

        return userList;
    }

    public static void checkForDuplicates(List<Integer> userList) throws DuplicatesNumbersException {
        Set<Integer> set = new HashSet<>();

        for (int uniqueNum : userList) {
            if (set.contains(uniqueNum)) { throw new DuplicatesNumbersException("List can't contain duplicates"); }
            else { set.add(uniqueNum); }
        }
    }
}
