package FileHandling;

import java.io.*;

public class Deserialization {
    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.id=10;
        emp.ctc=9.8;
        FileInputStream fic=null;
        ObjectInputStream ois=null;
        try {
            fic = new FileInputStream("D:/FileIO/repo.txt");
            ois = new ObjectInputStream(fic);
            Employee emp1=(Employee)ois.readObject();
            System.out.println(emp.id);
            System.out.println(emp.ctc);
        } catch (IOException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            try{
                ois.close();
                fic.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
