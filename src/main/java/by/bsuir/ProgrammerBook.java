package by.bsuir;

public class ProgrammerBook extends Book{
    private final String language;
    private final int level;
    public ProgrammerBook(String title, String author, int price, int edition, int isbn, String language, int level) {
        super(title, author, price, edition, isbn);
        this.language = language;
        this.level = level;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = language.hashCode() + 29 * result;
        result = level + 29 * result;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ProgrammerBook) || !super.equals(obj)) {
            return false;
        }
        if (obj.hashCode() != hashCode()) {
            return false;
        }

        ProgrammerBook programmerBook = (ProgrammerBook) obj;
        return this.language.equals(programmerBook.language) && this.level == programmerBook.level;
    }

    @Override
    public String toString() {
        return super.toString() + "\nlanguage: " + this.language + "\nlevel: " + this.level;
    }
}
