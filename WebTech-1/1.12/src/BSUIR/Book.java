package BSUIR;

public class Book {
    private String title;
    private String author;
    private int price;
    private static int edition;
    private int isbn;

    public Book(String title, String author, int price, int editions, int isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        edition = editions;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public static int getEdition() {
        return edition;
    }

    public int getIsbn() {
        return isbn;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() == Book.class) {
            Book buf = (Book)obj;
            if (this.title == buf.getTitle() && this.getAuthor() == buf.author &&
                this.price == buf.getPrice()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 5;
        result = 17 * result + title.hashCode() + author.hashCode() + price + edition;
        return result;
    }

    @Override
    public String toString() {
        return (title + " from " + author + ", " + edition + " edition, cost: " + price + ".");
    }

    @Override
    public Book clone()
    {
        Book clone = new Book(title, author, price, edition, isbn);
        return clone;
    }

    public int compareTo(Book book){
        return this.isbn - book.getIsbn();
    }
}
