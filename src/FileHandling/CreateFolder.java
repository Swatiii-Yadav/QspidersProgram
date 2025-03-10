package FileHandling;

import java.io.File;

public class CreateFolder {
    public static void main(String[] args) {
        File ref=new File("D:/FileIO/first");
        boolean flag=ref.exists();
        if (!flag)
        {
            ref.mkdir();
            System.out.println("Folder FileIO/first is created");
        }
        else{
            System.out.println("Folder Exists");
        }
    }
}
