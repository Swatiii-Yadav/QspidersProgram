package FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {
    int id;
    double ctc;
    public static void main(String[] args) {

    }
}
public class Serialization {
    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.id=10;
        emp.ctc=9.8;
        FileOutputStream foc=null;
        ObjectOutputStream oos=null;
        try {
            foc = new FileOutputStream("D:/FileIO/repo.txt");
            oos = new ObjectOutputStream(foc);
            oos.writeObject(emp);
            System.out.println("Serialization Completed");
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try{
                oos.close();
                foc.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}