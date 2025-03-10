package FileHandling;

import java.io.File;

public class ListFilesFolder {
    public static void main(String[] args) {
        File ref=new File("D:/FileIO");
        boolean flag=ref.exists();
        if (flag){
            String[] arr=ref.list();
            for (int i=0;i< arr.length;i++){
                System.out.println(arr[i]);
            }
        }
    }
}
