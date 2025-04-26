public class ThrowAndCatchException {
    public static void main(String[] args) {
        int result = -1;
        try {
            result = divideNumbers(5, 0);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e);
        }
        System.out.println(result);
    }

    public static int divideNumbers(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("You cannot divide by zero!");
        }
        return dividend / divisor;
    }
}
