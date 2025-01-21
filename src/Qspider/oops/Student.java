package Qspider.oops;

public class Student {
    Student(){
        System.out.println("Personal details");
        System.out.println("Academic details");
    }
    Student(boolean s){
        System.out.println("Personal details");
        System.out.println("Academic details");
        System.out.println("Experience Details");
    }
    public static void main(String[] args) {
        System.out.println("Details of Fresher");
        Student s1=new Student();
        System.out.println("Details of Experience");
        Student s2=new Student(true);

    }
}
