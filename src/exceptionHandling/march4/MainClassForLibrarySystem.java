package exceptionHandling.march4;



public class MainClassForLibrarySystem {
        public static void main(String[] args) {
            Librarry library = new Librarry();
            library.addBook(new Book("Harry Potter", "J.K. Rowling"));
            library.addBook(new Book("The Hobbit", "J.R.R. Tolkien"));

            try {
                library.borrowBook("Harry Potter");
                library.borrowBook("Harry Potter");
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
