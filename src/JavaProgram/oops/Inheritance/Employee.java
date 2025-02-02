package JavaProgram.oops.Inheritance;


/**
 * Write a Java program that creates a class hierarchy for employees of a company.
 * The base class should be Employee, with subclasses Manager, Developer, and  Programmer.
 * Each subclass should have properties such as name, address, salary, and job title. Implement methods
 * for calculating bonuses, generating performance reports, and managing projects.
 */
public class Employee {
    String name;
    String address;
    double salary;
    String job;
    Employee(String name,String address,double salary,String job){
        this.address=address;
        this.name=name;
        this.salary=salary;
        this.job=job;
    }

    double calcBonus() {
return 0.0;
    }

    void performanceReport() {

    }

    void ManageProject() {
    }


}

class Manager {
Manager(){

}

}

class Developer {

}

class Programmer {

}