package FileHandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterProg {
    public static void main(String[] args) {
        PrintWriter ref=null;
        try{
             ref=new PrintWriter("D:/FileIO/write2.txt");
            ref.println("Java");
            ref.println("Java");
            ref.println("development");
            ref.println("Java");
            ref.println(65);
            ref.println(3.45);
            ref.println(false);
            ref.println("Java");
            ref.flush();
            System.out.println(" writing completed");
        } catch (FileNotFoundException e) {
          e.printStackTrace();
        }
        finally {
            ref.close();
        }
    }
}
