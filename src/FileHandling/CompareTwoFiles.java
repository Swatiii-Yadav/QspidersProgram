package FileHandling;

import java.io.File;
import java.io.IOException;

public class CompareTwoFiles {
    public static void main(String[] args) {
        File ref=new File("D:/FileIO/demo.txt");
        File ref1=new File("D:/FileIO/demo1.txt");
        boolean flag=ref.exists();
        boolean flag1=ref1.exists();
       if(flag==true && flag1==true){
           System.out.println(ref.compareTo(ref1));
           System.out.println("Compared ");
       }
       else {
           System.out.println("Files not found" );
       }
    }
}
