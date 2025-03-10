package FileHandling;

import java.io.File;

public class CountCharInFile {
    public static void main(String[] args) {
        File ref=new File("D:/FileIO/demo.txt");
        boolean flag=ref.exists();
        if (flag){
            long count=ref.length();

            System.out.println("Count: "+count);
        }
        else {
            System.out.println("Not Found");
        }
    }
}
