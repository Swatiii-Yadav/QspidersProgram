package JavaProgram.oops.Inheritance;

import java.util.Scanner;
import java.util.SortedMap;

public  class MainClassForBooks {
     public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
         //books
         System.out.println("Name of Book");
         String title = sc.nextLine();

         System.out.println("Author of " + title);
         String Author = sc.nextLine();

         System.out.println("Isbn of " + title);
         long Isbn = sc.nextLong();


         System.out.println("Price of " + title);
         double price = sc.nextDouble();


         System.out.println("-------------------------------------------------");
         System.out.println("Books Details:");
         BookClass b1 = new BookClass(title, Author, Isbn, price);
         b1.displayBook();

         //fictional book
         System.out.println("Genre  of " + title);
         String genre = sc.nextLine();
         System.out.println("-------------------------------------------------");
         System.out.println("Fictional BOOOk details");
         FictionBook f1 = new FictionBook(title, Author, Isbn, price, genre);
         f1.displayBook();
         f1.displayFictionalBook();

         //academic books
         String[] subject = new String[5];
         System.out.println("Enter 5 books Names: ");
       for (int i=0;i<5;i++){
           subject[i]=sc.nextLine();
       }

         System.out.println("Edition of "+title);
         int   edition=sc.nextInt();

         System.out.println("-------------------------------------------------");
         System.out.println("Academic BOOOk details");
         AcademicBook a1=new AcademicBook(title,Author,Isbn,price,subject,edition);
         a1.displayBook();
         a1.displayAcademicBook();

     }
  }
