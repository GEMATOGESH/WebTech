package BSUIR;

import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Book book1 = new Book("Das Kapital", "Karl Heinrich Marx", 23, 1, 1);
        Book book2 = new Book("孫子兵法", "孫子", 100, 23, 2);
        Book book3 = book1.clone();
        System.out.println(book1.equals(book2));
        System.out.println(book1.equals(book3));
        System.out.println(book1.hashCode());
        System.out.println(book1.toString());
        Comparator<Book> bookNameComparator = new BookNameComparator();
        Comparator<Book> bookNameAuthorComparator = new BookNameComparator().thenComparing(new BookAuthorComparator());
        Comparator<Book> bookAuthorNameComparator = new BookAuthorComparator().thenComparing(new BookNameComparator());
        Comparator<Book> bookAuthorNamePriceComparator = new BookAuthorComparator().thenComparing
                (new BookNameComparator()).thenComparing(new BookPriceComparator());

        ProgrammerBook programmerBook1 = new ProgrammerBook("Python for dummies","Stef Maruch", 14,
                1, 3, "python", 0);
        ProgrammerBook programmerBook2 = new ProgrammerBook("Java for dummies","Barry A. Burd", 10,
                3, 4, "java", 1);
        System.out.println(programmerBook1.equals(programmerBook2));
        System.out.println(programmerBook1.equals(programmerBook1));
        System.out.println(programmerBook1.hashCode());
        System.out.println(programmerBook1.toString());
    }
}
