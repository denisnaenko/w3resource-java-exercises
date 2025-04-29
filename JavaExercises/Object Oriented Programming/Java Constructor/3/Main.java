public class Main {
    public static void main(String[] args) {
        Book book = new Book("Jack London", "Martin Eden");

        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());

        book.setPrice(5.99);
        System.out.println(book.getPrice());

        System.out.println(book);
    }
}
