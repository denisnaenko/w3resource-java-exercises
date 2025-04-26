public class OddValueException extends Exception {
    private final int detail;

    public OddValueException(int detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "OddValueException[" + detail + "]";
    }
}
