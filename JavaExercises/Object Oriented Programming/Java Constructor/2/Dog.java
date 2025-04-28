public record Dog(String name, String color) {
    public Dog {
        if (name.isEmpty() || color.isEmpty()) {
            throw new IllegalArgumentException("Fields cannot be empty");
        }
    }
}
