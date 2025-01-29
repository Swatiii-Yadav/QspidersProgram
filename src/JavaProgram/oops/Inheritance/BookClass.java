package JavaProgram.oops.Inheritance;

import java.util.Arrays;

/*
Base Class: Book
Attributes: Title, Author, ISBN, Base Price.
Behaviors: Display book details.

Child Class: FictionBook (inherits from Book)
Additional Attributes: Genre.
Behaviors: Display details with genre.


Child Class: AcademicBook (inherits from Book)
Additional Attributes: Subject, Edition.
Behaviors: Display details with subject and edition.

Task:
Create objects for different types of books.
Display details, including unique attributes for each type.


*/
public class BookClass {
    String  title;
       String Author;
       long ISBN;
       double BasePrice;
       BookClass( String  title,String Author,long ISBN,double BasePrice) {
         this.title=title;
         this.Author=Author;
         this.ISBN=ISBN;
         this.BasePrice=BasePrice;
       }
       void displayBook(){
          System.out.println("Book "+title);
          System.out.println("Author "+Author);
          System.out.println("Isbn no "+ISBN);
          System.out.println("Price "+BasePrice);
       }


}
class FictionBook extends BookClass{
String genre;
   FictionBook(String title, String Author, long ISBN, double BasePrice,String genre) {
      super(title, Author, ISBN, BasePrice);
      this.genre=genre;
   }
   void displayFictionalBook(){
      System.out.println("Genre "+genre);
   }

}
class  AcademicBook extends BookClass{
    String[] Subject;
    int Edition;
   AcademicBook(String title, String Author, long ISBN, double BasePrice,String[] Subject,int Edition) {
      super(title, Author, ISBN, BasePrice);
      this.Edition=Edition;
      this.Subject=Subject;
   }
   void displayAcademicBook(){
      System.out.println("Subject "+ Arrays.toString(Subject));
      System.out.println("Edition "+Edition);

   }
}
