package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class MainClas {
    public static void main(String[] args) {
        FileWriter ref=null;
        try{
            ref=new FileWriter("D:/FileIO/write.txt",true);
            ref.write("Java");
            ref.write("\n");
            ref.write("Java");
            ref.write("\n");
            ref.write("Java");
            ref.write("\n");
            char[] ch={'D','E','V','E','L','O','P','M','E','N','T'};
            ref.write(ch);
            ref.flush();
            System.out.println("Write Completed");
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                ref.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
