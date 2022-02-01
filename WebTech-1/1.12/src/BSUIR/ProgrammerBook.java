package BSUIR;

public class ProgrammerBook extends Book{
    private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price, int editions, int isbn, String language, int level) {
        super(title, author, price, editions, isbn);
        this.language = language;
        this.level = level;
    }

    public String getLanguage() {
        return language;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() == ProgrammerBook.class) {
            ProgrammerBook buf = (ProgrammerBook)obj;
            if (this.getTitle() == buf.getTitle() && this.getAuthor() == buf.getAuthor() &&
                    this.getPrice() == buf.getPrice() && this.language == buf.getLanguage()
                        && this.level == buf.getLevel()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 5;
        result = 17 * result + getTitle().hashCode() + getAuthor().hashCode() + getPrice() + getEdition() +
            language.hashCode() + level;
        return result;
    }

    @Override
    public String toString() {
        return (getTitle() + " from " + getAuthor() + ", " + getEdition() + " edition, language: " +
            language + " for level " + level + ", cost: " + getPrice() + ".");
    }
}
