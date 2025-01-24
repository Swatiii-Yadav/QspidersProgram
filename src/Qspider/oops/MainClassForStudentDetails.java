package Qspider.oops;

public class MainClassForStudentDetails {
    public static void main(String[] args) {
        StudentDetails std1=StudentTracker.createStudent();
        StudentTracker.displayStudentDetails(std1);

        StudentDetails std2=StudentTracker.createStudent();
        StudentTracker.displayStudentDetails(std2);

        StudentDetails std3=StudentTracker.createStudent();
        StudentTracker.displayStudentDetails(std3);

        StudentDetails std4=StudentTracker.createStudent();
        StudentTracker.displayStudentDetails(std4);
    }

}
