public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(evenVals(9));
        } catch (OddValueException e) {
            System.out.println("Error: " + e);
        }
    }

    public static String evenVals(int num) throws OddValueException{
        if (num % 2 != 0) {
            throw new OddValueException(num);
        }
        return "Your number is even!";
    }
}
