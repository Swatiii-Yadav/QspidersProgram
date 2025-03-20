package JavaProgram.objectClass;

import JavaProgram.oops.constructorChaining.Student;

class Student1 {

    String name="Swati";
}
class Student2{
     String name="Swati";
     @Override
    public String toString(){
         return name;
     }
}

public class MainClassForStudent{
    public static void main(String[] args) {
        Student1 s1=new Student1();
        System.out.println(s1.toString());
        Student2 s2=new Student2();
        System.out.println(s2.toString());
    }
}