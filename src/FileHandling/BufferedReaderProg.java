package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderProg {

    public static void main(String[] args) {
        BufferedReader ref=null;
        try{
            ref=new BufferedReader(new FileReader("D:/FileIO/write1.txt"));
            String val=ref.readLine();
            while (val!=null){
                System.out.println(val);
                val=ref.readLine();
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
