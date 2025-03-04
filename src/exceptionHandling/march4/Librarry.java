package exceptionHandling.march4;

import java.util.ArrayList;
import java.util.List;

public class Librarry {

    List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void borrowBook(String title) throws BookNotFoundException, BookNotAvailableException {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.borrowBook();
                System.out.println("You borrowed: " + title);
                return;
            }
        }
        throw new BookNotFoundException("Book " + title + "' not found in the library.");
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.returnBook();
                System.out.println("Book returned: " + title);
                return;
            }
        }
    }
}
