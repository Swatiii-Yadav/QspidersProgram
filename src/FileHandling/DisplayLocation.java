package FileHandling;

import java.io.File;

public class DisplayLocation {
   static  void display(File ref){
       boolean flag=ref.exists();
       if (flag){
           String loc= ref.getAbsolutePath();
           System.out.println(loc);
       }
       else{
           System.out.println("File not found");
       }
   }

    public static void main(String[] args) {
        File f1=new File("D:FileIO/demo.txt");
        display(f1);
    }
}
