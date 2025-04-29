public class Book {
    private final String title;
    private final String author;
    private Double price;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        setPrice(price);
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be lower than zero");
        }

        this.price = price;
    }

    public String getTitle() { return title; }

    public String getAuthor() { return author; }

    public double getPrice() {
        if (price == null) {
            throw new IllegalStateException("Price is not set yet for this book");
        }

        return price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + (price != null ? price : "not set") +
                '}';
    }
}
