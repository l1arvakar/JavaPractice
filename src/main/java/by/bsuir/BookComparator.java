package by.bsuir;

import java.util.Comparator;

public class BookComparator {
    public static class TitleComparator implements Comparator<Book> {
        @Override
        public int compare(Book o1, Book o2){
            return o1.getTitle().compareTo(o2.getTitle());
        }
    }

    public static class TitleAuthorComparator implements Comparator<Book> {
        @Override
        public int compare(Book o1, Book o2) {
            int titleCompare = o1.getTitle().compareTo(o2.getTitle());
            return titleCompare != 0 ? titleCompare : o1.getAuthor().compareTo(o2.getAuthor());
        }
    }

    public static class AuthorTitleComparator implements Comparator<Book> {
        @Override
        public int compare (Book o1, Book o2) {
            int authorCompare = o1.getAuthor().compareTo(o2.getAuthor());
            return authorCompare != 0 ? authorCompare : o1.getTitle().compareTo(o2.getTitle());
        }
    }

    public static class AuthorTitlePriceComparator implements Comparator<Book> {
        @Override
        public int compare(Book o1, Book o2) {
            return o1.getAuthor().compareTo(o2.getAuthor()) != 0 ? o1.getAuthor().compareTo(o2.getAuthor()) : o1.getTitle().compareTo(o2.getTitle()) != 0 ? o1.getTitle().compareTo(o2.getTitle()) : Integer.compare(o1.getPrice(), o2.getPrice());
        }
    }
}
