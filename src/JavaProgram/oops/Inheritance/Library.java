package JavaProgram.oops.Inheritance;
/*
 * Library System
 * A library contains various items, including books, magazines, and DVDs.
 * All library items have a unique identifier and a title and can be borrowed or returned.
 *  However, each type might have unique properties; for instance, a book has an author and many
 *  pages, while a DVD might have a runtime. Let us see how we can implement this example using
 * the Inheritance.
 */


//Multi Level Inheritance

public class Library {
     int id;
    String title;

   void borrow(){
       System.out.println(id+" borrows "+title);
   }
   void Return(){
       System.out.println(id+" return  "+title);
   }

}
class Book extends Library{
    int pages;
    String author;


}
class DVD extends Library{
    int runTime;

}
