package oopsPracticeQuestions.february9;

import JavaProgram.oops.Inheritance.Doctor;

public class Employee {
    int empId;
    String company;
    double salary;
    Employee(int empId, String company, double salary){
        this.empId=empId;
        this.company=company;
        this.salary=salary;
    }
    void work(){
        System.out.println(empId+" in "+company+" earn "+salary+" per month ");
    }
}

