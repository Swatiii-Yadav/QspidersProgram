package FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        File ref=new File("D:/FileIO/dir/script.js");
        boolean flag=ref.exists();
        if (!flag)
        {
            try {
                ref.createNewFile();
                System.out.println(" File is created");
            } catch (IOException e) {
               e.printStackTrace();
            }
        }
        else{
            System.out.println("FIle already  Exists");
        }
    }
}
