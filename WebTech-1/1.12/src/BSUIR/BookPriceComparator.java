package BSUIR;

import java.util.Comparator;

public class BookPriceComparator implements Comparator<Book> {
    public int compare(Book book1, Book book2){
        return book1.getPrice() - book2.getPrice();
    }
}
