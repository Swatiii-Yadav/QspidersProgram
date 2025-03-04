package exceptionHandling.march4;


import java.util.ArrayList;
import java.util.List;

class BookNotAvailableException extends Exception {
        public BookNotAvailableException(String message) {
            super(message);
        }
    }
    class BookNotFoundException extends Exception {
        public BookNotFoundException(String message) {
            super(message);
        }
    }

   public class Book {
        private String title;
        private String author;
        private boolean isAvailable;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
            this.isAvailable = true;
        }

        public String getTitle()
        {
            return title;
        }
        public boolean isAvailable() {
            return isAvailable;
        }

        public void borrowBook() throws BookNotAvailableException {
            if (!isAvailable) {
                throw new BookNotAvailableException("Book  " + title + "' is  Not available.");
            }
            isAvailable = false;
        }

        public void returnBook() {
            isAvailable = true;
        }
    }




