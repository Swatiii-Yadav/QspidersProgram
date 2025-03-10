package FileHandling;

import java.io.File;

public class DeleteFileOrFolder {
    public static void main(String[] args) {
        File ref=new File("D:/FileIO");
        boolean flag=ref.exists();
        if (flag){
            ref.delete();
            System.out.println(" first is  deleted.");
        }
        else {
            System.out.println("first  is not present in system.");
        }
    }
}
