package FileHandling;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderProg {
    public static void main(String[] args) {
        FileReader ref=null;
        try{
            ref=new FileReader("D:/FileIO/write1.txt");
            int val=ref.read();
            while (val!=-1){
                System.out.println((char) val);
                val=ref.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try{
                ref.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
