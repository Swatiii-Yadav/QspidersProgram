package FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter1 {
    public static void main(String[] args) {
        BufferedWriter ref = null;
        try {
            ref = new BufferedWriter(new FileWriter("D:/FileIO/write1.txt"));
            ref.write("Java");
            ref.newLine();
            ref.write("Java");
            ref.newLine();
            ref.write("Java"); ref.newLine();
            char[] ch = {'D', 'E', 'V', 'E', 'L', 'O', 'P', 'M', 'E', 'N', 'T'};
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
