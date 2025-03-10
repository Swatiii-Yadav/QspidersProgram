package FileHandling;

import java.io.File;

public class ListFiles {
    public static void main(String[] args) {
        File ref=new File("D:/FileIO");
        boolean flag=ref.exists();
        if (flag){
            String[] arr=ref.list();
            for (int i=0;i< arr.length;i++){
                File obj=new File(ref,arr[i]);
                boolean status =obj.isFile();
                if (status) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
