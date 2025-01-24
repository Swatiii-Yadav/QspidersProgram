package Qspider.oops;

import java.util.Scanner;

public class StudentTracker {
     static void displayStudentDetails(StudentDetails s) {
         System.out.println("YOP: "+s.yop);
         System.out.println("CGPA: "+s.cgpa);
         System.out.println("Mobile: "+s.mobile);
    }
    static StudentDetails createStudent(){
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter YOP:");
      int yop=sc.nextInt();
        System.out.println("Enter cgpa:");
      double cgpa=sc.nextDouble();
        System.out.println("Enter Mobile:");
        long mobile=sc.nextLong();
        StudentDetails std=new StudentDetails(yop,cgpa,mobile);
        return std;
    }
}
